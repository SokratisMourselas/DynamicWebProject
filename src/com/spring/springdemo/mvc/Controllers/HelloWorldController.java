package com.spring.springdemo.mvc.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormToUpperCase(HttpServletRequest request, Model model){

        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = "Thank you "+ name;

        model.addAttribute("message", result);

        return "helloWorld";
    }


}
