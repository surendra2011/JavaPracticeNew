package com.company;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private int id;
    private static final AtomicInteger uniqueId = new AtomicInteger(1001);
    private String firstName;
    private String lastName;
    private String domain;
    private int supervisorId;
    private float salary;
    private Object joiningDate;

    public Employee(String firstName, String lastName, float salary, LocalDate joiningDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.id = uniqueId.getAndIncrement();
    }

     // public void printEmployee(){
     //   System.out.println(id + "\t\t\t" + firstName + "\t\t" + lastName + "\t\t\t" + salary + "\t\t" + joiningDate);
   // }

    @Override
    public String toString(){
        return id + "\t\t\t" + firstName + "\t\t" + lastName + "\t\t\t" + salary + "\t\t" + joiningDate;
    }


}

