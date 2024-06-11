package com.opentext.MyFirstApplication.model;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GetEmployeeDetails {

    private List<Employee> employees;

    public GetEmployeeDetails() {
        this.employees = new ArrayList<>();
        employees.add(new Employee(1, "Gyan Kumar", "Gaya Bihar", "Opentext Employee", "03-02-2002", "KL University"));
        employees.add(new Employee(2, "Divyanshu Vig", "Haryana", "Opentext Employee", "15-02-2002", "Chitkara University"));
        employees.add(new Employee(3, "Mithun", "Bangalore", "Opentext Employee", "12-12-1992", "OT"));
        employees.add(new Employee(4, "Amar V", "Bangalore", "Opentext Employee", "16-06-1985", "OT"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}

//This code defines a service class GetEmployeeDetails that manages a list of employees and initializes the list with employee data upon creation.
// It provides methods to retrieve all employees getEmployees() and to fetch an employee by their ID.