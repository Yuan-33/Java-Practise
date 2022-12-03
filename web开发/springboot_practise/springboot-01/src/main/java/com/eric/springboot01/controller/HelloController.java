package com.eric.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello,springboot";
    }
}
