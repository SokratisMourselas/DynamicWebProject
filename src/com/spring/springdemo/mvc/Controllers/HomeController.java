package com.spring.springdemo.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/main-menu")
    public String showMainMenu(){
        return "main-menu";
    }


}
