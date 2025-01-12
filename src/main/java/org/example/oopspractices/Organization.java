package org.example.oopspractices;

public class Organization {

    private String orgName;
    private String orgAddress;
    private String contactNumber;
    private Employee employee;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "orgName='" + orgName + '\'' +
                ", orgAddress='" + orgAddress + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", employee=" + employee +
                '}';
    }
}
