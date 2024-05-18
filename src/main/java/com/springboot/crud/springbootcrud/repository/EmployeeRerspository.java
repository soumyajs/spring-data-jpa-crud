package com.springboot.crud.springbootcrud.repository;

import com.springboot.crud.springbootcrud.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRerspository extends CrudRepository<Employee, Integer> {
}
