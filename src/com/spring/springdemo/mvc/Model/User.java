package com.spring.springdemo.mvc.Model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull(message = "*is required")
    @Size(min = 1, message = "*is required")
    private String name;

    private String password;
    private String country;
    private String favProLang;

    private String[] favOperatingSystems;

    public User(){}

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
}
