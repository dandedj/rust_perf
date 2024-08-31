mod openrtb_request;

use actix_web::{web, App as ActixApp, HttpServer, HttpResponse, Responder, HttpRequest, get, post};
use serde::Serialize;
use std::io;
use env_logger;
use openrtb_request::OpenRTBRequest;
use std::env;
use log::{info, debug};

#[derive(Debug, Serialize)]
struct JsonResponse {
    coppa_present: bool,
}

#[get("/version")]
async fn get_version() -> impl Responder {
    let version = env!("CARGO_PKG_VERSION");
    info!("Version request received. Responding with version: {}", version);
    HttpResponse::Ok().body(version)
}

#[post("/parse_json")]
async fn parse_json(request: web::Json<OpenRTBRequest>) -> impl Responder {
    if cfg!(debug_assertions) {
        debug!("Received request at /parse_json");
        debug!("Request content: {:?}", request);
    }

    let coppa_present = request.regs
        .as_ref()
        .and_then(|regs| regs.coppa)
        .map_or(false, |coppa| coppa == 1);
    let response = JsonResponse { coppa_present };

    HttpResponse::Ok().json(response)
}

async fn log_request(req: HttpRequest, body: String) -> impl Responder {
    info!("Received request at default handler:");
    debug!("Method: {}", req.method());
    debug!("Path: {}", req.path());
    debug!("Headers: {:#?}", req.headers());
    debug!("Body: {}", body);
    
    HttpResponse::Ok().body("Request logged")
}

#[actix_web::main]
async fn main() -> io::Result<()> {
    if cfg!(debug_assertions) {
        env_logger::init_from_env(env_logger::Env::new().default_filter_or("debug"));
        info!("Starting server on localhost:8080 in debug mode");
    } else {
        env_logger::init_from_env(env_logger::Env::new().default_filter_or("info"));
        info!("Starting server on localhost:8080 in release mode");
    }

    HttpServer::new(|| {
        if cfg!(debug_assertions) {
            info!("Creating new app instance");
        }
        ActixApp::new()
            .wrap(actix_web::middleware::Logger::default())
            .service(parse_json)
            .service(get_version)
            .default_service(web::route().to(log_request))
    })
    .bind("localhost:8080")?
    .run()
    .await
}
