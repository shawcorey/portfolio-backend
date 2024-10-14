package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HomeService;

@RestController
public class HomeController {

    // Inject the HomeService
    @Autowired
    private HomeService homeService;

    @GetMapping("/api/home")
    public String getHome() {
        // Call the service method to get the message
        return homeService.getHomeMessage();
    }
}
