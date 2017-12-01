package models;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Dhruva Juloori on 11/27/2017.
 */
@Entity
@Table(name = "syllabus", schema = "project_515")
@NamedQuery(name="SyllabusEntity.findAll", query="Select s from SyllabusEntity s")
public class SyllabusEntity {
    @Id
    @Column(name = "class_id", nullable = false, length = 45)
    private String classId;

    @Basic
    @Column(name = "syllabus", nullable = true)
    private byte[] syllabus;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }


    public byte[] getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(byte[] syllabus) {
        this.syllabus = syllabus;
    }

}
