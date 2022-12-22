package uk.co.example.qualityservicebackend.service;

import co.uk.example.quality.common.data.QualityData;
import co.uk.example.quality.common.data.QualitySummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class QualityBuildService {
    public static final Logger log = LoggerFactory.getLogger(QualityBuildService.class);

    public Map<String, String> healthCheck() {
        log.info("quality-service-backend health check");

        Map <String, String> map = new HashMap<>();
        map.put("http-status", HttpStatus.OK.toString());
        map.put("timestamp", LocalDateTime.now().toString());
        map.put("service", "quality-service-backend");

        QualitySummary summary = new QualitySummary();
        boolean approval = summary.approveRequest();

        return map;
    }

}
