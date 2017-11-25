package models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Dhruva Juloori on 11/22/2017.
 */
@Entity
@Table(name = "classes", schema = "project_515")
public class ClassesEntity {
    @Id
    @Column(name = "class_id", nullable = false, length = 45)
    private String classId;

    @Basic
    @Column(name = "class_name", nullable = true, length = 45)
    private String className;


    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name ="user_name")
    private UserEntity usr;

    public UserEntity getUsr() {
        return usr;
    }

    public void setUsr(UserEntity usr) {
        this.usr = usr;
    }
}
