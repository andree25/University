package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customers", schema = "final_project_db", catalog = "")
public class CustomersEntity {
    private int customerId;
    private String name;
    private String adress;
    private String phoneNumber;
    private String email;
    private String birthday;
    private String gender;
    private String username;
    private String password;
    private Integer subscriptionId;
    private Integer trainerId;
    private Integer exercisePlanId;
    private Integer scheduleId;
    private Integer hallId;

    @Id
    @Column(name = "customerID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "subscriptionID")
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Basic
    @Column(name = "trainerID")
    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    @Basic
    @Column(name = "exercise_planID")
    public Integer getExercisePlanId() {
        return exercisePlanId;
    }

    public void setExercisePlanId(Integer exercisePlanId) {
        this.exercisePlanId = exercisePlanId;
    }

    @Basic
    @Column(name = "scheduleID")
    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "hallID")
    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersEntity that = (CustomersEntity) o;
        return customerId == that.customerId &&
                Objects.equals(name, that.name) &&
                Objects.equals(adress, that.adress) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(email, that.email) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(subscriptionId, that.subscriptionId) &&
                Objects.equals(trainerId, that.trainerId) &&
                Objects.equals(exercisePlanId, that.exercisePlanId) &&
                Objects.equals(scheduleId, that.scheduleId) &&
                Objects.equals(hallId, that.hallId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, adress, phoneNumber, email, birthday, gender, username, password, subscriptionId, trainerId, exercisePlanId, scheduleId, hallId);
    }
}
