package org.example;

public class Employee {
  protected    String name;
    protected String emailAddress;
    protected String phone;
    protected String Department;
    protected String address;
    protected int yearOgBirth;

    public Employee(){
        System.out.println("No parameter Contractor");
    }

    public Employee(String name, String emailAddress, String phone, String department, String address, int yearOgBirth) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        Department = department;
        this.address = address;
        this.yearOgBirth = yearOgBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOgBirth() {
        return yearOgBirth;
    }

    public void setYearOgBirth(int yearOgBirth) {
        this.yearOgBirth = yearOgBirth;
    }
}
