package org.example;

public class DailyDeveloper extends Employee {

    private float WorkedDayPrice;
    private int dailyRate;



   public DailyDeveloper(){

    }


    public float getSalary() {
        return getWorkedDayPrice()* dailyRate;
    }

    public DailyDeveloper(String name, String emailAddress, String department, String address, float salary, float workedDayPrice, int dailyRate) {
        super(name, emailAddress, department, address, salary);
       this.WorkedDayPrice = workedDayPrice;
        this.dailyRate = dailyRate;
    }

    public float getWorkedDayPrice() {
        return WorkedDayPrice;
    }

    public void setWorkedDayPrice(float workedDayPrice) {
        WorkedDayPrice = workedDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}
