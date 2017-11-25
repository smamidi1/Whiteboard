package models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Dhruva Juloori on 11/22/2017.
 */
@Entity
@Table(name = "ta", schema = "project_515")
public class TaEntity implements Serializable{
    @Id
    @Column(name = "ta_id", nullable = false, length = 45)
    private String taId;

    @Basic
    @Column(name = "ta_name", nullable = true, length = 45)
    private String taName;

    @Basic
    @Column(name = "ta_email", nullable = true, length = 45)
    private String taEmail;

    @Basic
    @Column(name = "ta_phone", nullable = true, length = 45)
    private String taPhone;

    @Basic
    @Column(name = "ta_timings", nullable = true)
    private Timestamp taTimings;

    @Basic
    @Column(name = "assignment_id", nullable = true, length = 45)
    private String assignmentId;


    public String getTaId() {
        return taId;
    }

    public void setTaId(String taId) {
        this.taId = taId;
    }


    public String getTaName() {
        return taName;
    }

    public void setTaName(String taName) {
        this.taName = taName;
    }


    public String getTaEmail() {
        return taEmail;
    }

    public void setTaEmail(String taEmail) {
        this.taEmail = taEmail;
    }


    public String getTaPhone() {
        return taPhone;
    }

    public void setTaPhone(String taPhone) {
        this.taPhone = taPhone;
    }

    public Timestamp getTaTimings() {
        return taTimings;
    }

    public void setTaTimings(Timestamp taTimings) {
        this.taTimings = taTimings;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

}
