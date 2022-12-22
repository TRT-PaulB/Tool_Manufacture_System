package co.uk.example.quality.common.data;
import org.springframework.validation.annotation.Validated;
import java.io.Serializable;

@Validated
public class QualitySummary implements QualityData, Serializable {

    private String qalRemarks;

    public boolean approveRequest() {
        return true;
    }

}
