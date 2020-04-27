package com.sapfzj.testsentry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSentryController {

    private static final Logger logger = LoggerFactory.getLogger(TestSentryController.class);

    @GetMapping("logError")
    public String logError(){
        String errorMsg = "Test error on sentry";
        logger.error(errorMsg);
        return errorMsg;
    }

    @GetMapping("dump")
    public String dump(){
        float f = 1/0;
        return "dump";
    }

}
