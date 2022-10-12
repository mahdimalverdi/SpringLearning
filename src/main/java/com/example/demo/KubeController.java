package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeController {
    @Value("${hello.message}")
    private String helloWorldMessage;

    @GetMapping("hello/static")
    public String staticConfig() {
        return "Hello world";
    }

    @GetMapping("hello/internal_config")
    public String internalConfig() {
        return helloWorldMessage;
    }
}