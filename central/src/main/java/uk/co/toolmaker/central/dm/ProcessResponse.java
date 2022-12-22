package uk.co.toolmaker.central.dm;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

@Validated
public class ProcessResponse {

    @JsonProperty("processRecord")
    private ProcessRecord processRecord;

    public ProcessResponse addRecord(ProcessRecord processRecord) {
        this.processRecord = processRecord;
        return this;
    }

    public ProcessRecord getProcessRecord() {
        return processRecord;
    }

    public void setProcessRecord(ProcessRecord processRecord) {
        this.processRecord = processRecord;
    }
}
