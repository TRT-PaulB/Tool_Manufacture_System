package uk.co.example.qualityservicebackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class QualityBuildService {
    public static final Logger log = LoggerFactory.getLogger(QualityBuildService.class);

    public Map<String, String> healthCheck() {
        log.info("quality-service-backend health check");

        Map <String, String> map = new HashMap<>();
        map.put("http-status", HttpStatus.OK.toString());
        map.put("timestamp", "");
        map.put("service", "quality-service-backend");

        return map;
    }

}
