package com.company;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeBuilder {
    private String firstName;
    private String lastName;
    private float salary;
    LocalDate joiningDate;


    public EmployeeBuilder setFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setSalary(float salary){
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setJoiningDate(LocalDate date){
        this.joiningDate = date;
        return this;
    }

    public Employee getEmployee(){
        return new Employee(firstName, lastName,salary, joiningDate);
    }
}
