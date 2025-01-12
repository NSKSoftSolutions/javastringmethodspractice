package org.example.oopspractices.client.apps;

import org.example.oopspractices.Employee;
import org.example.oopspractices.Organization;

public class OrganizationClient {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("XYZ");
        employee.setAddress("BNGLR");
        employee.setMobileNumber(1234567L);

        Organization organization = new Organization();
        organization.setOrgAddress("WTFL");
        organization.setContactNumber("12345678");
        organization.setOrgName("IBC");

        organization.setEmployee(employee);

        System.out.println(organization);

    }


}
