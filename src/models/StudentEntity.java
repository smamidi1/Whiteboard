package models;

import javax.persistence.*;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */
@Entity
@Table(name = "student", schema = "project_515")
public class StudentEntity {
    private String studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhno;

    @Id
    @Column(name = "student_id", nullable = false, length = 45)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "student_name", nullable = true, length = 45)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "student_email", nullable = true, length = 45)
    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Basic
    @Column(name = "student_phno", nullable = true, length = 45)
    public String getStudentPhno() {
        return studentPhno;
    }

    public void setStudentPhno(String studentPhno) {
        this.studentPhno = studentPhno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        if (studentEmail != null ? !studentEmail.equals(that.studentEmail) : that.studentEmail != null) return false;
        if (studentPhno != null ? !studentPhno.equals(that.studentPhno) : that.studentPhno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studentEmail != null ? studentEmail.hashCode() : 0);
        result = 31 * result + (studentPhno != null ? studentPhno.hashCode() : 0);
        return result;
    }
}
