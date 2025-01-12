package org.example.oopspractices;

public class Employee {

    int empId;
    String empName;
    String address;
    long mobileNumber;



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public Employee() {
        System.out.println("Employee Object is created");
    }

    public Employee(int empId, String empName, String address, long mobileNumber) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        System.out.println("empId -->" + empId);
        System.out.println("empName -->" + empName);
        System.out.println("empAddress -->" + address);
        System.out.println("empMobileNumber -->" + mobileNumber);
    }


}
