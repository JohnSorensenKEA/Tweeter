package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/")
    public String index(){
        return "redirect:/test";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
