package models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Dhruva Juloori on 11/23/2017.
 */
@Entity
@Table(name = "schedule", schema = "project_515")
public class ScheduleEntity {
    private Timestamp timings;
    private String location;
    private String scheduleId;

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

    @Id
    @Column(name = "schedule_id", nullable = false, length = 45)
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

}
