package com.eric.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestFulController {
    @RequestMapping("/hello2/{a}/{b}")
    // @GetMapping @DeleteMapping @PostMapping
    // @RequestMapping("/hello2/{a}/{b}",method=".../...")
    // http://localhost:8080/hello2/1/2?str=szy
    public String hello(@PathVariable int a, @PathVariable int b, @RequestParam("str") String str, Model model){
        int ans = a + b;
        String str1 = str;
        model.addAttribute("msg",ans);
        model.addAttribute("msg2",str1);
        return "hello";

    }
}
