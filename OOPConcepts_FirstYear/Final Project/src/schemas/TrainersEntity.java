package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trainers", schema = "final_project_db", catalog = "")
public class TrainersEntity {
    private int trainerId;
    private String name;
    private String phone;
    private String email;
    private String birthday;
    private String gender;
    private String specialty;
    private String username;
    private String password;
    private Integer customerId;
    private Integer exercisePlanId;
    private Integer scheduleId;

    @Id
    @Column(name = "trainerID")
    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
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
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "specialty")
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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
    @Column(name = "customerID")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainersEntity that = (TrainersEntity) o;
        return trainerId == that.trainerId &&
                Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(specialty, that.specialty) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(exercisePlanId, that.exercisePlanId) &&
                Objects.equals(scheduleId, that.scheduleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId, name, phone, email, birthday, gender, specialty, username, password, customerId, exercisePlanId, scheduleId);
    }
}
