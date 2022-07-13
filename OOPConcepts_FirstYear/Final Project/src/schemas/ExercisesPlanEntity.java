package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "exercises_plan", schema = "final_project_db", catalog = "")
public class ExercisesPlanEntity {
    private int exercisesPlanId;
    private String name;
    private Integer equipmentId;

    @Id
    @Column(name = "exercises_planID")
    public int getExercisesPlanId() {
        return exercisesPlanId;
    }

    public void setExercisesPlanId(int exercisesPlanId) {
        this.exercisesPlanId = exercisesPlanId;
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
    @Column(name = "equipmentID")
    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExercisesPlanEntity that = (ExercisesPlanEntity) o;
        return exercisesPlanId == that.exercisesPlanId &&
                Objects.equals(name, that.name) &&
                Objects.equals(equipmentId, that.equipmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exercisesPlanId, name, equipmentId);
    }
}
