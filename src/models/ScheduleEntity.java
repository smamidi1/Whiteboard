package models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Dhruva Juloori on 11/25/2017.
 */
@Entity
@Table(name = "schedule", schema = "project_515")
public class ScheduleEntity {
    @Id
    @Column(name = "class_id", nullable = false, length = 45)
    private String classId;

    @Basic
    @Column(name = "timings", nullable = true)
    private Timestamp timings;

    @Basic
    @Column(name = "location", nullable = true, length = 45)
    private String location;


    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }


    public Timestamp getTimings() {
        return timings;
    }

    public void setTimings(Timestamp timings) {
        this.timings = timings;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
