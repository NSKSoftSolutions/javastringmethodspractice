package org.example;

import org.example.domain.Employee;
import org.example.services.EmployeeServices;
import org.example.services.EmployeeServicesImpl;

public class EmployeeClientApp {

    public static void main(String[] args) {

        //BC bc=new DC();
        EmployeeServices employeeServices = new EmployeeServicesImpl();


        boolean result = employeeServices.onBoardEmployee(new Employee(1, "ABC"));
        if (result) {
            System.out.println("Welcome to IBC ");
        } else {
            System.out.println("Please check ur Documents and consult onBoarding Team of IBC");
        }

        Employee emp = employeeServices.getEmployee(2);
        if (emp != null) {
            System.out.println(emp);
        }


    }

}
