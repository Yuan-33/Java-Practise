package com.eric.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String hello(){
        System.out.println(11111);
        return "index";
    }
}
