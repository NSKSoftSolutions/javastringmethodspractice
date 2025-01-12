package org.example.services;

import org.example.domain.Employee;

public abstract class EmployeeServices {

    public abstract boolean onBoardEmployee(Employee employee);

    Employee employee;

    public Employee getEmployee(int empId) {
        if (empId != 0) {
            System.out.println("Fething Emp Details");
            employee = new Employee(1, "XYZ");
        }
        return employee;
    }


}
