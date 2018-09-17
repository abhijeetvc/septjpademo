package com.septjpademo.septjpademo.controller;

import com.septjpademo.septjpademo.model.Employee;
import com.septjpademo.septjpademo.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 16/09/18.
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/save")
    public String saveData(@RequestBody Employee employee){

        employeeRepo.save(employee);
        return "Data saved";
    }


}
