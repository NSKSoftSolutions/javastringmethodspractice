package org.example.oopspractices;

public class Manager extends Employees {

    double salary = 80000.00;


    public void displaySlaries() {
        System.out.println("Manager salary is -->" + salary);
        System.out.println("Employee salary is -->" + super.salary);
    }
}
