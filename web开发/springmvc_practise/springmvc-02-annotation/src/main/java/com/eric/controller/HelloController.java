package com.eric.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/s") 总的 -> /s/hello
// @RestController 不会被视图解析器解析 直接返回String "hello"
public class HelloController {
    @RequestMapping("/hello") // 网页 /hello
    public String hello(Model model){
        model.addAttribute("msg","HelloSpringMVCAnnotation!");
        return "hello"; //被视图解析器处理 跳转到jsp页面
    }
}
