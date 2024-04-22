package org.example;

public class HourlyDeveloper extends Employee {
    private  float workOurPrice;
    private  int hourlyRate;



    public float getSalary() {
        return hourlyRate*workOurPrice;
    }

    public HourlyDeveloper(String name, String emailAddress, String department, String address, float salary, float workOurPrice, int hourlyRate) {
        super(name, emailAddress, department, address, salary);
        this.workOurPrice = workOurPrice;
        this.hourlyRate = hourlyRate;
    }

    public float getWorkOurPrice() {
        return workOurPrice;
    }

    public void setWorkOurPrice(float workOurPrice) {
        this.workOurPrice = workOurPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
