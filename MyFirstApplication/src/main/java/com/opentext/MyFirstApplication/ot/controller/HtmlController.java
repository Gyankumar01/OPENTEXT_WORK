package com.opentext.MyFirstApplication.ot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/showEmployees")
    public String showEmployeesPage() {
        return "getEmp";
    }
}

//This class is a Spring MVC controller that handles requests for displaying an HTML page.
//It maps the /showEmployees URL to the getEmp.html When users access "/showEmployees", it returns the "getEmp" template for rendering.