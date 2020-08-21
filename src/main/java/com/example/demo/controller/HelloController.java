package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/fast")
    public String helloFast() {
        return "fast";
    }

    @GetMapping("/slow")
    public String helloSlow() throws InterruptedException {
        Thread.sleep(2000);
        return "slow";
    }
}
