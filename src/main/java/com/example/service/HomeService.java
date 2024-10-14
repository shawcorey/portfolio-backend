package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getHomeMessage() {
        return "Welcome to the Home page!";
    }
}
