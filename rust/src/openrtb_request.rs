use serde::{Deserialize, Serialize};

#[derive(Debug, Serialize, Deserialize)]
pub struct OpenRTBRequest {
    pub id: Option<String>,
    pub publisher: Option<Publisher>,
    pub device: Option<Device>,
    pub user: Option<User>,
    pub imp: Option<Vec<Imp>>,
    pub app: Option<App>,
    pub site: Option<Site>,
    pub coppa: Option<i32>,
    pub test: Option<String>,
    pub at: Option<i32>, // Change from Option<String> to Option<i32>
    pub tmax: Option<i32>, // Add this field
    pub wseat: Option<Vec<String>>, // Add this field
    pub allimps: Option<i32>, // Add this field
    pub bcat: Option<Vec<String>>, // Add this field
    pub badv: Option<Vec<String>>, // Add this field
    pub ext: Option<serde_json::Value>, // Add this field
    pub cur: Option<Vec<String>>, // Change from Option<Vec<String>> to Option<Vec<String>>
    pub regs: Option<Regs>, // Add this field
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Publisher {
    pub id: Option<String>,
    pub name: Option<String>,
    pub cat: Option<Vec<String>>,
    pub domain: Option<String>,
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Device {
    pub ua: Option<String>,
    pub geo: Option<Geo>,
    pub ip: Option<String>,
    pub devicetype: Option<i32>, // Change from Option<String> to Option<i32>
    pub make: Option<String>,
    pub model: Option<String>,
    pub os: Option<String>,
    pub osv: Option<String>,
    pub language: Option<String>,
    pub dnt: Option<i32>, // Add this field
    pub lmt: Option<i32>, // Add this field
    pub h: Option<i32>, // Add this field
    pub w: Option<i32>, // Add this field
    pub carrier: Option<String>, // Add this field
    pub connectiontype: Option<i32>, // Add this field
    pub ifa: Option<String>, // Add this field
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Geo {
    pub lat: Option<f32>,
    pub lon: Option<f32>,
    pub country: Option<String>,
    pub region: Option<String>, // Add this field
    pub metro: Option<String>, // Add this field
    pub city: Option<String>, // Add this field
    pub zip: Option<String>, // Add this field
    pub r#type: Option<i32>, // Add this field
}

#[derive(Debug, Serialize, Deserialize)]
pub struct User {
    pub id: Option<String>,
    pub buyeruid: Option<String>,
    pub yob: Option<i32>, // Add this field
    pub gender: Option<String>, // Add this field
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Imp {
    pub id: Option<String>,
    pub banner: Option<Banner>,
    pub video: Option<Video>,
    pub native: Option<Native>,
    pub bidfloor: Option<f64>, // Add this field
    pub bidfloorcur: Option<String>, // Add this field
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Banner {
    pub w: Option<i32>,
    pub h: Option<i32>,
    pub pos: Option<i32>,
    pub battr: Option<Vec<i32>>, // Add this field
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Video {
    pub mimes: Option<Vec<String>>,
    pub minduration: Option<i32>,
    pub maxduration: Option<i32>,
    pub protocols: Option<Vec<i32>>,
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Native {
    pub request: Option<String>,
}

#[derive(Debug, Serialize, Deserialize)]
pub struct App {
    pub id: Option<String>,
    pub name: Option<String>,
    pub bundle: Option<String>,
    pub storeurl: Option<String>, // Add this field
    pub cat: Option<Vec<String>>, // Add this field
    pub ver: Option<String>, // Add this field
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Site {
    pub id: Option<String>,
    pub name: Option<String>,
    pub domain: Option<String>,
}

#[derive(Debug, Serialize, Deserialize)]
pub struct Regs {
    pub coppa: Option<i32>,
    pub gdpr: Option<i32>,
}