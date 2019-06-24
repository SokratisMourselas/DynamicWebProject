package com.spring.springdemo.mvc.Controllers;

import com.spring.springdemo.mvc.Model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class LoginController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/login-form")
    public String showLoginForm(Model theModel){

        User theUser = new User();

        theModel.addAttribute("user", theUser);
        // add the country options to the model
        theModel.addAttribute("theCountryOptions", countryOptions);
        return "login-form";
    }


    @RequestMapping("/loginForm")
    public String loginUser(@ModelAttribute("user") User theUser){

        //logging the input data
        System.out.println("the User is set to : "+ theUser.getName() + " from " + theUser.getCountry());

        // Has the user set  a password question
        String passwordSet = theUser.getPassword().isEmpty() ? "NO" : "YES";
        System.out.println("Has the User set a password? --> " + passwordSet);

        return "main-menu";
    }


}
