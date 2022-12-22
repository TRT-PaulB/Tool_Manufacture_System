package uk.co.toolmaker.central.dm;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;

// this is just a makeshift class!!!
@Validated
public class ProcessRecord {

    @JsonProperty("id")
    private int id;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("submissionTime")
    private LocalDateTime submissionTime;

    @JsonProperty("deletionTime")
    private LocalDateTime deletionTime;


    public ProcessRecord(int id, String remarks, LocalDateTime submissionTime) {
        this.id = id;
        this.remarks = remarks;
        this.submissionTime = submissionTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDateTime getSubmissionTime() {
        return submissionTime;
    }

    public LocalDateTime getDeletionTime() {
        return deletionTime;
    }

    public void setDeletionTime(LocalDateTime deletionTime) {
        this.deletionTime = deletionTime;
    }

    public void setSubmissionTime(LocalDateTime submissionTime) {
        this.submissionTime = submissionTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessRecord that = (ProcessRecord) o;
        return id == that.id && Objects.equals(remarks, that.remarks)
                && Objects.equals(submissionTime, that.submissionTime)
                && Objects.equals(deletionTime, that.deletionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, remarks, submissionTime, deletionTime);
    }
}
