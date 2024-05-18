package com.springboot.crud.springbootcrud.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table
public class Employee {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    //@GeneratedValue(generator="EMPLOYEE_SEQ")
    //@SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstnName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
