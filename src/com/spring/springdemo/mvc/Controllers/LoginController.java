package com.spring.springdemo.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login-form")
    public String showLoginForm(){
        return "login-form";
    }


    @RequestMapping("/login")
    public String loginUser(){
        return "main-menu";
    }


}
