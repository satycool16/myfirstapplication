package com.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Spring boot is working";
    }

    @RequestMapping("/order")
    public String order() {
        return "Order placed";
    }
}
