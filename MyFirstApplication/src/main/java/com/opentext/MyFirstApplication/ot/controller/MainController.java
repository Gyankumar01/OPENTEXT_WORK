package com.opentext.MyFirstApplication.ot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to My First Web Application!";
    }

}
//This Spring MVC controller returns a welcome message when users access the root URL ("/") of the web application.

