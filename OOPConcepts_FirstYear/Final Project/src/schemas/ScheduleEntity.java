package schemas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "schedule", schema = "final_project_db", catalog = "")
public class ScheduleEntity {
    private int scheduleId;
    private String date;
    private String time;

    @Id
    @Column(name = "scheduleID")
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleEntity that = (ScheduleEntity) o;
        return scheduleId == that.scheduleId &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleId, date, time);
    }
}
