package models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */
@Entity
@Table(name = "schedule", schema = "project_515")
public class ScheduleEntity {
    private String scheduleId;
    private Timestamp timings;
    private String location;
    private String classname;

    @Id
    @Column(name = "schedule_id", nullable = false, length = 45)
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "timings", nullable = true)
    public Timestamp getTimings() {
        return timings;
    }

    public void setTimings(Timestamp timings) {
        this.timings = timings;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 45)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "classname", nullable = true, length = 45)
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity that = (ScheduleEntity) o;

        if (scheduleId != null ? !scheduleId.equals(that.scheduleId) : that.scheduleId != null) return false;
        if (timings != null ? !timings.equals(that.timings) : that.timings != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (classname != null ? !classname.equals(that.classname) : that.classname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scheduleId != null ? scheduleId.hashCode() : 0;
        result = 31 * result + (timings != null ? timings.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (classname != null ? classname.hashCode() : 0);
        return result;
    }
}
