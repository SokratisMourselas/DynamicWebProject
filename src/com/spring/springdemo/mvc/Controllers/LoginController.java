package com.spring.springdemo.mvc.Controllers;

import com.spring.springdemo.mvc.Model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class LoginController {

    // trimming Strings
    // Removing whitespaces
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/login-form")
    public String showLoginForm(Model theModel){

        User theUser = new User();

        theModel.addAttribute("user", theUser);
        // add the country options to the model
//        theModel.addAttribute("theCountryOptions", countryOptions);
        return "login-form";
    }


    @RequestMapping("/loginForm")
    public String loginUser(@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult){
        System.out.println("Last name: | " + theUser.getName()+ " |");
        if (theBindingResult.hasErrors()){
            return "login-form";
        } else {
            return "main-menu";
        }
    }

}
