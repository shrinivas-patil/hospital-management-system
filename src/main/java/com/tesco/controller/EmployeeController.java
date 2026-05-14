package com.tesco.controller;

import com.tesco.entity.Employee;
import com.tesco.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping
    public String getMessage() {
        return "Employee API Working";
    }
}
