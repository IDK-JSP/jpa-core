package com.learn.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/test")
public class testController {

    @PostConstruct
    public void init() {
        System.out.println("✅ testController chargé !");
    }

    @GetMapping("/hello")
    public String testUserEndpoint() {
        return "User endpoint is working!";
    }
}
