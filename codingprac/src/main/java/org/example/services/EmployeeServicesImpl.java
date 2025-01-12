package org.example.services;

import org.example.domain.Employee;

public class EmployeeServicesImpl extends EmployeeServices {
    @Override
    public boolean onBoardEmployee(Employee employee) {
        System.out.println("Employee is Onboarding to Org");
        return true;
    }
}
