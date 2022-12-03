package com.eric.controller;

import com.eric.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eric.pojo.User;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    //登陆提交
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String pwd) throws Exception {
        System.out.println("接收前端===" + username);
        session.setAttribute("user", username);
        session.setAttribute("pwd", pwd);
        System.out.println(session.getAttribute("user"));
        System.out.println(session.getAttribute("pwd"));

        return "login";
    }

}


