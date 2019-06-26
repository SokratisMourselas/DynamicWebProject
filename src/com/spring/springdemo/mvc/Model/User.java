package com.spring.springdemo.mvc.Model;

import com.spring.springdemo.mvc.Annotations.CourseCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

//--------- Variables---------------


    @NotNull(message = "*is required")
    @Size(min = 1, message = "*is required")
    private String name;

    private String password;

    private String country;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "please enter 5 chars/digits")
    private String postalCode;

    private String favProLang;

    private String[] favOperatingSystems;

    @CourseCode
    private String courseCode;


//--------- Variables---------------

    //--------- Constructor---------------
    public User(){}
    //--------- Constructor---------------

        //--------- Methods---------------


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String[] getFavOperatingSystems() {
        return favOperatingSystems;
    }

    public void setFavOperatingSystems(String[] favOperatingSystems) {
        this.favOperatingSystems = favOperatingSystems;
    }

    public String getFavProLang() {
        return favProLang;
    }

    public void setFavProLang(String favProLang) {
        this.favProLang = favProLang;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

        //--------- Methods---------------
}
