package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subscriptions", schema = "final_project_db", catalog = "")
public class SubscriptionsEntity {
    private int subscriptionId;
    private String name;
    private String period;
    private String price;
    private Integer hallId;
    private Integer exercisesPlanId;
    private Integer trainerId;

    @Id
    @Column(name = "subscriptionID")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
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
    @Column(name = "period")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "hallID")
    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    @Basic
    @Column(name = "exercises_planID")
    public Integer getExercisesPlanId() {
        return exercisesPlanId;
    }

    public void setExercisesPlanId(Integer exercisesPlanId) {
        this.exercisesPlanId = exercisesPlanId;
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
        SubscriptionsEntity that = (SubscriptionsEntity) o;
        return subscriptionId == that.subscriptionId &&
                Objects.equals(name, that.name) &&
                Objects.equals(period, that.period) &&
                Objects.equals(price, that.price) &&
                Objects.equals(hallId, that.hallId) &&
                Objects.equals(exercisesPlanId, that.exercisesPlanId) &&
                Objects.equals(trainerId, that.trainerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId, name, period, price, hallId, exercisesPlanId, trainerId);
    }
}
