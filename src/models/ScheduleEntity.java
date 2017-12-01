package models;

import javax.persistence.*;

/**
 * Created by Dhruva Juloori on 11/27/2017.
 */
@Entity
@Table(name = "schedule", schema = "project_515")
@NamedQuery(name="ScheduleEntity.findAll", query="Select s from ScheduleEntity s")
public class ScheduleEntity {
    @Basic
    @Column(name = "timings", nullable = true, length = 45)
    private String timings;

    @Basic
    @Column(name = "location", nullable = true, length = 45)
    private String location;

    @Id
    @Column(name = "id", nullable = false, length = 45)
    private String id;


    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
