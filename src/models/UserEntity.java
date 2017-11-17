package models;

import javax.persistence.*;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */
@Entity
@Table(name = "user", schema = "project_515")
@NamedQueries({@NamedQuery(name="UserEntity.findAll", query="Select u from UserEntity u"),
               @NamedQuery(name="UserEntity.Validation",query="Select u from UserEntity u where u.username = :username and u.password = :password"),
               @NamedQuery(name="UserEntity.findByPassword",query="Select u from UserEntity u where u.password = :password"),
               @NamedQuery(name="UserEntity.findByUsertype",query="Select u from UserEntity u where u.usertype = :usertype")})
public class UserEntity {
    private String username;
    private String password;
    private String usertype;

    @Id
    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "usertype", nullable = true, length = 45)
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (usertype != null ? !usertype.equals(that.usertype) : that.usertype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (usertype != null ? usertype.hashCode() : 0);
        return result;
    }
}
