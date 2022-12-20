package uk.co.example.qualityservicebackend.ctrl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.example.qualityservicebackend.service.QualityBuildService;
import java.util.Map;


@RestController
@RequestMapping("/rest/service/quality-build-service")
public class QualityBuildController {

    private final QualityBuildService qualityBuildService;

    public QualityBuildController(final QualityBuildService qualityBuildService) {
        this.qualityBuildService = qualityBuildService;
    }

    @GetMapping(value = "/healthCheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> getHealthDetails() {
        var statusMap = qualityBuildService.healthCheck();
        return new ResponseEntity<>(statusMap, HttpStatus.OK);
    }

}

