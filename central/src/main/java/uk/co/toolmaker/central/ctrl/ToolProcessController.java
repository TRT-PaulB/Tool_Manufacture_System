package uk.co.toolmaker.central.ctrl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.co.toolmaker.central.dm.ProcessRecord;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/rest/central/process")
public class ToolProcessController {

    private static final Logger logger = LoggerFactory.getLogger(ToolProcessController.class);


    // TODO change this to POST and test with POSTMAN
    @GetMapping("/submit/notes/{notes}")
    ResponseEntity<ProcessRecord> submitReadingToQuality(@PathVariable("notes") final String remarks) {

        logger.info("notes received: " + remarks);


        // TODO do some checking central side

        // TODO call quality client which will put on the queue & return a ProcessRecord
        var result = new ProcessRecord(1, remarks, LocalDateTime.now());

        return ResponseEntity.ok().body(result);
    }




}
