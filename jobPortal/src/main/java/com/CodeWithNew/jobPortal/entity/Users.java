//package com.CodeWithNew.jobPortal.entity;
//import java.sql.Date;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotEmpty;
//
//@Entity
//@Table(name="users")
//public class Users {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int userId;
//	
//	@Column(unique=true)
//	private String email;
//	
//	@NotEmpty
//	private String password;
//	private boolean isActive;
//	
//	@DateTimeFormat(pattern="dd-MM-yyyy")
//	private Date registrationDate;
//	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="userTypeId",referencedColumnName="userTypeId")
//	private UserType userTypeId;
//
//	public Users(int userId, String email, @NotEmpty String password, boolean isActive, Date registrationDate,
//			UserType userTypeId) {
//		super();
//		this.userId = userId;
//		this.email = email;
//		this.password = password;
//		this.isActive = isActive;
//		this.registrationDate = registrationDate;
//		this.userTypeId = userTypeId;
//	}
//
//	public Users() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public boolean isActive() {
//		return isActive;
//	}
//
//	public void setActive(boolean isActive) {
//		this.isActive = isActive;
//	}
//
//	public Date getRegistrationDate() {
//		return registrationDate;
//	}
//
//	public void setRegistrationDate(Date registrationDate) {
//		this.registrationDate = registrationDate;
//	}
//
//	public UserType getUserTypeId() {
//		return userTypeId;
//	}
//
//	public void setUserTypeId(UserType userTypeId) {
//		this.userTypeId = userTypeId;
//	}
//
//	@Override
//	public String toString() {
//		return "Users [userId=" + userId + ", email=" + email + ", password=" + password + ", isActive=" + isActive
//				+ ", registrationDate=" + registrationDate + ", userTypeId=" + userTypeId + "]";
//	}
//	
//
//}

package com.CodeWithNew.jobPortal.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="users")
public class Users {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "user_id")  // maps to user_id column
    private int userId;

    @Column(name = "email", unique = true)
    private String email;

    @NotEmpty
    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private boolean isActive;

    @DateTimeFormat(pattern="dd-MM-yyyy")
    @Column(name = "registration_date")
    private Date registrationDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_type_id", referencedColumnName = "user_type_id")
    private UserType userTypeId;

    // Constructors, getters, setters, toString (unchanged except annotations above)

    public Users(int userId, String email, @NotEmpty String password, boolean isActive, Date registrationDate,
                 UserType userTypeId) {
        super();
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.registrationDate = registrationDate;
        this.userTypeId = userTypeId;
    }

    public Users() {
        // Default constructor
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public UserType getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(UserType userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Override
    public String toString() {
        return "Users [userId=" + userId + ", email=" + email + ", password=" + password + ", isActive=" + isActive
                + ", registrationDate=" + registrationDate + ", userTypeId=" + userTypeId + "]";
    }
}

