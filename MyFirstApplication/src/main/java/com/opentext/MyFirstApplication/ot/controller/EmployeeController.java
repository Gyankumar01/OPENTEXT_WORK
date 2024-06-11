package com.opentext.MyFirstApplication.ot.controller;

import com.opentext.MyFirstApplication.model.Employee;
import com.opentext.MyFirstApplication.model.GetEmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
//This annotation in Spring is used for automatic dependency injection.
//It tells Spring to automatically instantiate and inject the required dependencies into the annotated field
    private GetEmployeeDetails employeeDetails;

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {
        return employeeDetails.getEmployees();
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeDetails.getEmployeeById(id);
    }
}
//This Java class is a REST controller that manages requests related to employee data.
// It uses annotations like @RestController and @Autowired for configuration.
// It defines methods to handle GET requests for fetching all employees and retrieving a specific employee by ID.
