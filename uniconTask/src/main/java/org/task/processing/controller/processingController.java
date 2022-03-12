package org.task.processing.controller;
    import lombok.extern.log4j.Log4j2;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class processingController {

    @GetMapping(value = "/processing", produces = "text/plain; charset=UTF-8")
    public ResponseEntity<String> processingData(@RequestParam("url") String url ,
                                                 @RequestParam("tagType")String tagType, @RequestParam("unit") int unit){

        log.info("/processing...: ");

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
