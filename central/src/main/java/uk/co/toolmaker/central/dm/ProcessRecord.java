package uk.co.toolmaker.central.dm;

import java.time.LocalDateTime;

// this is just a makeshift class!!!
public class ProcessRecord {

    private int id;
    private String remarks;
    private LocalDateTime submissionTime;

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
}
