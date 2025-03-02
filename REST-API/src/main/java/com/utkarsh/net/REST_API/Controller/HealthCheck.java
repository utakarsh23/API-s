package com.utkarsh.net.REST_API.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class HealthCheck {

    @GetMapping
    public String healthCheck() {
        return "It's cool here";
    }
}
