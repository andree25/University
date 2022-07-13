package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "equipments", schema = "final_project_db", catalog = "")
public class EquipmentsEntity {
    private int equipmentId;
    private String name;
    private String duration;

    @Id
    @Column(name = "equipmentID")
    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
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
    @Column(name = "duration")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentsEntity that = (EquipmentsEntity) o;
        return equipmentId == that.equipmentId &&
                Objects.equals(name, that.name) &&
                Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentId, name, duration);
    }
}
