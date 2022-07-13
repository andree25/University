package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "halls", schema = "final_project_db", catalog = "")
public class HallsEntity {
    private int hallId;
    private String name;
    private Integer customerId;
    private Integer trainerId;
    private Integer exercisesPlanId;

    @Id
    @Column(name = "hallID")
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
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

    @Basic
    @Column(name = "exercises_planID")
    public Integer getExercisesPlanId() {
        return exercisesPlanId;
    }

    public void setExercisesPlanId(Integer exercisesPlanId) {
        this.exercisesPlanId = exercisesPlanId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HallsEntity that = (HallsEntity) o;
        return hallId == that.hallId &&
                Objects.equals(name, that.name) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(trainerId, that.trainerId) &&
                Objects.equals(exercisesPlanId, that.exercisesPlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hallId, name, customerId, trainerId, exercisesPlanId);
    }
}
