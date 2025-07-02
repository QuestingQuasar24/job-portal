package com.example.jobPortal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users_type")
public class UsersType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userTypeId;
    private String userTypeName;
    @OneToMany(targetEntity = Users.class , mappedBy = "userTypeId" , cascade = CascadeType.ALL)
    private List<Users> users;

    @Column(unique = true)
    private String email;


    public UsersType() {
    }

    public UsersType(int userTypeId, String userTypeName, List<Users> users , String email) {
        this.userTypeId = userTypeId;
        this.userTypeName = userTypeName;
        this.users = users;
        this.email = email;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "UsersType{" +
                "userTypeId=" + userTypeId +
                ", userTypeName='" + userTypeName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
