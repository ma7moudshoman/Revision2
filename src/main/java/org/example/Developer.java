package org.example;

public class Developer extends Employee{
    String projectName;

    public Developer(){
        System.out.println("Sub Class");
    }
    public Developer( String projectName ,String name, String emailAddress, String phone, String department, String address, int yearOgBirth ){
        super(name, emailAddress, phone, department, address, yearOgBirth);
        this.projectName=projectName;

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
