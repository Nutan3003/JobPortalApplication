//package com.CodeWithNew.jobPortal.entity;
//
//import java.util.List;
//
//import io.micrometer.common.lang.NonNull;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="users_type")
//public class UserType {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int userTypeId;
//
//    @NonNull
//    private String userTypename;
//
//    @OneToMany(targetEntity = Users.class, mappedBy = "userTypeId", cascade = CascadeType.ALL)
//    private List<Users> users;
//
//    // No-argument constructor (essential for JPA)
//    public UserType() {
//    }
//
//    // Parameterized constructor
//    public UserType(int userTypeId, String userTypename, List<Users> users) {
//        super();
//        this.userTypeId = userTypeId;
//        this.userTypename = userTypename;
//        this.users = users;
//    }
//
//    public int getUserTypeId() {
//        return userTypeId;
//    }
//
//    public void setUserTypeId(int userTypeId) {
//        this.userTypeId = userTypeId;
//    }
//
//    public String getUserTypename() {
//        return userTypename;
//    }
//
//    public void setUserTypename(String userTypename) {
//        this.userTypename = userTypename;
//    }
//
//    public List<Users> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<Users> users) {
//        this.users = users;
//    }
//
//    @Override
//    public String toString() {
//        return "UserType [userTypeId=" + userTypeId + ", userTypename=" + userTypename + "]";
//    }
//}

package com.CodeWithNew.jobPortal.entity;

import java.util.List;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")  // maps to user_type_id column
    private int userTypeId;

    @NonNull
    @Column(name = "user_type_name")  // maps to user_type_name column
    private String userTypename;

    @OneToMany(targetEntity = Users.class, mappedBy = "userTypeId", cascade = CascadeType.ALL)
    private List<Users> users;

    // No-argument constructor
    public UserType() {
    }

    // Parameterized constructor
    public UserType(int userTypeId, String userTypename, List<Users> users) {
        super();
        this.userTypeId = userTypeId;
        this.userTypename = userTypename;
        this.users = users;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypename() {
        return userTypename;
    }

    public void setUserTypename(String userTypename) {
        this.userTypename = userTypename;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserType [userTypeId=" + userTypeId + ", userTypename=" + userTypename + "]";
    }
}

