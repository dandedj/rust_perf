package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collections;

@SpringBootApplication
@RestController
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);
    }

    @PostMapping("/parse_json")
    public ResponseEntity<JsonResponse> parseJson(@RequestBody OpenRTBRequest request) {
        long startTime = System.nanoTime();
        
        // Process the request (parsing JSON)
        boolean coppaPresent = request.getRegs().getCoppa() != null;
        JsonResponse response = new JsonResponse(coppaPresent);
        
        long duration = (System.nanoTime() - startTime) / 1_000_000; // Convert to milliseconds
        
        logger.info("POST /parse_json - 200 OK - {}ms", duration);

        return ResponseEntity.ok(response);
    }

    static class JsonResponse {
        private boolean coppaPresent;

        public JsonResponse(boolean coppaPresent) {
            this.coppaPresent = coppaPresent;
        }

        // Getter
        public boolean isCoppaPresent() {
            return coppaPresent;
        }

        // Setter
        public void setCoppaPresent(boolean coppaPresent) {
            this.coppaPresent = coppaPresent;
        }
    }
}