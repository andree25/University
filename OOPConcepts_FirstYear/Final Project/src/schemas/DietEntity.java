package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "diet", schema = "final_project_db", catalog = "")
public class DietEntity {
    private int dietId;
    private String name;
    private String kiloCal;
    private String mealTime;
    private Integer customerId;
    private Integer trainerId;

    @Id
    @Column(name = "dietID")
    public int getDietId() {
        return dietId;
    }

    public void setDietId(int dietId) {
        this.dietId = dietId;
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
    @Column(name = "kiloCal")
    public String getKiloCal() {
        return kiloCal;
    }

    public void setKiloCal(String kiloCal) {
        this.kiloCal = kiloCal;
    }

    @Basic
    @Column(name = "mealTime")
    public String getMealTime() {
        return mealTime;
    }

    public void setMealTime(String mealTime) {
        this.mealTime = mealTime;
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
    @Column(name = "trainerID")
    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DietEntity that = (DietEntity) o;
        return dietId == that.dietId &&
                Objects.equals(name, that.name) &&
                Objects.equals(kiloCal, that.kiloCal) &&
                Objects.equals(mealTime, that.mealTime) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(trainerId, that.trainerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dietId, name, kiloCal, mealTime, customerId, trainerId);
    }
}
