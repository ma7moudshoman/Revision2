package org.example;

public class Employee {
  private      String name;
    private String email;
    private String Department;
    private String address;
    private float Salary;

    public Employee(){

    }

    public Employee(String name, String emailAddress, String department, String address, float salary) {
        this.name = name;
        this.email = emailAddress;
        Department = department;
        this.address = address;
        this.Salary =salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return email;
    }

    public void setEmailAddress(String emailAddress) {
        this.email = email;
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

    public float getSalary() {
        return Salary;
    }

    public  void print(){
        System.out.println("Mahmoud");
    }
    public void setSalary(int salary) {
        this.Salary=salary;
    }
}
