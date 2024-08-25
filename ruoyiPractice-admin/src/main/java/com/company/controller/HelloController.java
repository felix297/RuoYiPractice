package com.company.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello () {
        return "Hello! This is my practice project for RuoYi framework.";
    }
}