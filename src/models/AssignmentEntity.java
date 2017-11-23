package models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Dhruva Juloori on 11/22/2017.
 */
@Entity
@Table(name = "assignment", schema = "project_515")
public class AssignmentEntity implements Serializable {
    private String assignmentId;
    private String assignmentName;
    private String assignmentDesc;
    private Integer totalPoints;

    @Id
    @Column(name = "assignment_id", nullable = false, length = 45)
    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    @Basic
    @Column(name = "assignment_name", nullable = true, length = 45)
    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    @Basic
    @Column(name = "assignment_desc", nullable = true, length = 45)
    public String getAssignmentDesc() {
        return assignmentDesc;
    }

    public void setAssignmentDesc(String assignmentDesc) {
        this.assignmentDesc = assignmentDesc;
    }

    @Basic
    @Column(name = "total_points", nullable = true)
    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

}
