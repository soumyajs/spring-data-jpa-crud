package com.springboot.crud.springbootcrud.controller;

import com.springboot.crud.springbootcrud.entity.Employee;
import com.springboot.crud.springbootcrud.service.EmployeeService;
import org.hibernate.annotations.WhereJoinTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService empService ;

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        System.out.println("Inside getAllEmployees()");
        return empService.getAllEmployees();
    }

    @PostMapping("/")
    public Employee addNewEmplyee(@RequestBody Employee emp){
        return empService.createNewEmployees(emp);
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        return empService.getEmployee(id);
    }
}
