package com.spring.springdemo.mvc.Controllers;

import com.spring.springdemo.mvc.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login-form")
    public String showLoginForm(Model model){
        model.addAttribute("user", new User());
        return "login-form";
    }


    @RequestMapping("/loginForm")
    public String loginUser(@ModelAttribute("user") User theUser){

        //logging the input data
        System.out.println("the User is set to : "+ theUser.getName());

        // Has the user set  a password question
        String passwordSet = theUser.getPassword().isEmpty() ? "NO" : "YES";
        System.out.println("Has the User set a password? --> " + passwordSet);

        return "main-menu";
    }


}
