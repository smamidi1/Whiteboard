package models;

import javax.persistence.*;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */
@Entity
@Table(name = "assignment", schema = "project_515")
public class AssignmentEntity {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssignmentEntity that = (AssignmentEntity) o;

        if (assignmentId != null ? !assignmentId.equals(that.assignmentId) : that.assignmentId != null) return false;
        if (assignmentName != null ? !assignmentName.equals(that.assignmentName) : that.assignmentName != null)
            return false;
        if (assignmentDesc != null ? !assignmentDesc.equals(that.assignmentDesc) : that.assignmentDesc != null)
            return false;
        if (totalPoints != null ? !totalPoints.equals(that.totalPoints) : that.totalPoints != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = assignmentId != null ? assignmentId.hashCode() : 0;
        result = 31 * result + (assignmentName != null ? assignmentName.hashCode() : 0);
        result = 31 * result + (assignmentDesc != null ? assignmentDesc.hashCode() : 0);
        result = 31 * result + (totalPoints != null ? totalPoints.hashCode() : 0);
        return result;
    }
}
