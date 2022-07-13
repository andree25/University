package models;

public class DietTable {
    int dietID;
    String name, kiloKal, mealTime, customer;

    public DietTable(int dietID, String name, String kiloKal, String mealTime, String customer) {
        this.dietID = dietID;
        this.name = name;
        this.kiloKal = kiloKal;
        this.mealTime = mealTime;
        this.customer = customer;
    }

    public int getDietID() {
        return dietID;
    }

    public void setDietID(int dietID) {
        this.dietID = dietID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKiloKal() {
        return kiloKal;
    }

    public void setKiloKal(String kiloKal) {
        this.kiloKal = kiloKal;
    }

    public String getMealTime() {
        return mealTime;
    }

    public void setMealTime(String mealTime) {
        this.mealTime = mealTime;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
