package com.sweetshop.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "✅ Sweet Shop Backend is running successfully!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the Sweet Shop API!";
    }
}
