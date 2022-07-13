package models;

public class ScheduleTableCust {
    int scheduleID;
    String customer, date, time, hall;

    public ScheduleTableCust(int scheduleID, String customer, String date, String time, String hall) {
        this.scheduleID = scheduleID;
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.hall = hall;
    }

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }
}
