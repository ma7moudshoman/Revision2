package org.example;

public class SalariedDeveloper extends Employee {

    float bouns;

public SalariedDeveloper(){

}

    public SalariedDeveloper(String name, String emailAddress, String department, String address, float salary, float bouns) {
        super(name, emailAddress, department, address, salary);
        this.bouns = bouns;
    }

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }
 @Override
    public float getSalary() {
        return super.getSalary()+bouns;
    }

    public  void print(){
        System.out.println("Sub-class");
    }

}
