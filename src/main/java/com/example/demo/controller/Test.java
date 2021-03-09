package com.example.demo.controller;

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

    @GetMapping("/error")
    public String err(){
        return "error";
    }
}
