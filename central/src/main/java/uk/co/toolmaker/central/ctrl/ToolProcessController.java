package uk.co.toolmaker.central.ctrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.co.toolmaker.central.dm.ProcessRecord;
import uk.co.toolmaker.central.dm.ProcessResponse;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/rest/central/process")
public class ToolProcessController {

    private static final Logger logger = LoggerFactory.getLogger(ToolProcessController.class);

    @GetMapping("/retrieve/notes/{notes}")
    ResponseEntity<ProcessRecord> retrieveReadingToQuality(@PathVariable("notes") final String remarks) {
        logger.info("getting results: notes received: " + remarks);
        var result = new ProcessRecord(1, remarks, LocalDateTime.now());
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/retrieve/id/{id}")
    ProcessResponse retrieveById(@PathVariable("id") final int processRecordId) {
        logger.info("getting results for id: " + processRecordId);
        var result = new ProcessRecord(48, "returning in own block", LocalDateTime.now());
        return new ProcessResponse().addRecord(result);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<ProcessRecord> updateReadingToQuality(@PathVariable("id") final int recordId,
                                                         @RequestBody final ProcessRecord processRecord) {
        logger.info("updated notes received - remarks: " + processRecord.getRemarks());
        var result = new ProcessRecord(processRecord.getId(), processRecord.getRemarks(), processRecord.getSubmissionTime());
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/submit")
    ResponseEntity<ProcessRecord> submitReadingToQuality(@RequestBody final ProcessRecord processRecord)
            throws IllegalArgumentException {
        if (processRecord.getId() == 47) {
            throw new IllegalArgumentException("Can't do things like that in international test match cricket");
        }

        logger.info("process record submitted - remarks: " + processRecord.getRemarks());
        processRecord.setId(47);
        return ResponseEntity.ok().body(processRecord);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<ProcessRecord> deleteReading(@PathVariable("id") final int recordId) {
        logger.info("deleting process record with id: " + recordId);
        var processRecord = new ProcessRecord(48, "", null);
        processRecord.setDeletionTime(LocalDateTime.now());
        return ResponseEntity.ok().body(processRecord);
    }


}
