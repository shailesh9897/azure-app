package com.azureapp.demo_azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String greetings(){
        return "Hello user!";
    }
}
