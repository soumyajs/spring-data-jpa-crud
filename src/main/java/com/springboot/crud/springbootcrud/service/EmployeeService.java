package com.springboot.crud.springbootcrud.service;

import com.springboot.crud.springbootcrud.entity.Employee;
import com.springboot.crud.springbootcrud.repository.EmployeeRerspository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRerspository employeeRepo;

    public List<Employee> getAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        employeeRepo.findAll().forEach(e->empList.add(e));
        return empList;
    }

    public Employee createNewEmployees(Employee emp){
        System.out.println(emp);
        return employeeRepo.save(emp);
    }

    public Employee getEmployee (int id){
        return employeeRepo.findById(id).get();
    }
}
