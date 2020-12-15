package com.company;
import java.time.LocalDate;
public class EmployeeOperations {
    public static void main (String[] args) {
        LocalDate date = LocalDate.now();
        //Employee emp = new Employee("Surendra","Reddy",50000,date);
        //Employee emp1 = new Employee("Siva Ram","Reddy",50000,date);
        System.out.println("Employee ID" + "\t\t" + "FirstName" + "\t\t" + "LastName" + "\t\t" + "Salary" + "\t\t" + "Date");
        //System.out.println(emp);
        //System.out.println(emp1);
       // emp.printEmployee();
        //emp1.printEmployee();
        Employee emp = new EmployeeBuilder().setFirstName("Surendra").setLastName("Reddy").setJoiningDate(date).getEmployee();
        Employee emp1 = new EmployeeBuilder().setFirstName("Siva Ram").setLastName("Reddy").setJoiningDate(date).setSalary(52500).getEmployee();
        System.out.println(emp);
        System.out.println(emp1);

    }
}
