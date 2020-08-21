package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/fast")
    public String helloFast() {
        logger.info("request");
        return "fast";
    }

    @GetMapping("/slow")
    public String helloSlow() throws InterruptedException {
        Thread.sleep(2000);
        return "slow";
    }
}
