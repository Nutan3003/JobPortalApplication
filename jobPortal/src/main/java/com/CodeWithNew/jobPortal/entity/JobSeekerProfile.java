package com.CodeWithNew.jobPortal.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//@Entity
//@Table(name="job_seeker_profile")
//public class JobSeekerProfile {
//	@Id
//	private int userAccountId;
//	
//	@OneToOne
//	@JoinColumn(name="user_account_id")
//	private Users userId;
//	
//	private String firstName;
//	private String lastName;
//	private String city;
//	private String state;
//	private String country;
//	private String workAuthorization;
//	private String employmentType;
//	@Column(nullable=true,length=64)
//    private String profilePhoto;
//	
//	@OneToMany(targetEntity=Skills.class,cascade=CascadeType.ALL,mappedBy="jobSeekerProfile")
//	private List<Skills>skills;
//	public JobSeekerProfile() {
//		
//	}
//	
//public JobSeekerProfile(Users userId) {
//	this.userId=userId;
//		
//	}
//
//	public JobSeekerProfile(int userAccountId, Users userId, String firstName, String lastName, String city,
//			String state, String country, String workAuthorization, String employmentType, String profilePhoto,
//			List<Skills> skills) {
//		super();
//		this.userAccountId = userAccountId;
//		this.userId = userId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//		this.workAuthorization = workAuthorization;
//		this.employmentType = employmentType;
//		this.profilePhoto = profilePhoto;
//		this.skills = skills;
//	}
//
//	public int getUserAccountId() {
//		return userAccountId;
//	}
//
//	public void setUserAccountId(int userAccountId) {
//		this.userAccountId = userAccountId;
//	}
//
//	public Users getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Users userId) {
//		this.userId = userId;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getWorkAuthorization() {
//		return workAuthorization;
//	}
//
//	public void setWorkAuthorization(String workAuthorization) {
//		this.workAuthorization = workAuthorization;
//	}
//
//	public String getEmploymentType() {
//		return employmentType;
//	}
//
//	public void setEmploymentType(String employmentType) {
//		this.employmentType = employmentType;
//	}
//
//	public String getProfilePhoto() {
//		return profilePhoto;
//	}
//
//	public void setProfilePhoto(String profilePhoto) {
//		this.profilePhoto = profilePhoto;
//	}
//
//	public List<Skills> getSkills() {
//		return skills;
//	}
//
//	public void setSkills(List<Skills> skills) {
//		this.skills = skills;
//	}
//
//	@Override
//	public String toString() {
//		return "JobSeekerProfile [userAccountId=" + userAccountId + ", userId=" + userId + ", firstName=" + firstName
//				+ ", lastName=" + lastName + ", city=" + city + ", state=" + state + ", country=" + country
//				+ ", workAuthorization=" + workAuthorization + ", employmentType=" + employmentType + ", profilePhoto="
//				+ profilePhoto + ", skills=" + skills + "]";
//	}
//    
//	
//	
//
//	
//	
//
//}
////CREATE TABLE `job_seeker_profile` (
////		  `user_account_id` int NOT NULL,
////		  `city` varchar(255) DEFAULT NULL,
////		  `country` varchar(255) DEFAULT NULL,
////		  `employment_type` varchar(255) DEFAULT NULL,
////		  `first_name` varchar(255) DEFAULT NULL,
////		  `last_name` varchar(255) DEFAULT NULL,
////		  `profile_photo` varchar(255) DEFAULT NULL,
////		  `resume` varchar(255) DEFAULT NULL,
////		  `state` varchar(255) DEFAULT NULL,
////		  `work_authorization` varchar(255) DEFAULT NULL,
////		  PRIMARY KEY (`user_account_id`),
////		  CONSTRAINT `FKohp1poe14xlw56yxbwu2tpdm7` FOREIGN KEY (`user_account_id`) REFERENCES `users` (`user_id`)
////		) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


@Entity
@Table(name="job_seeker_profile")
public class JobSeekerProfile {

    @Id
    @Column(name = "user_account_id")
    private int userAccountId;

    @OneToOne(cascade = CascadeType.ALL) // cascade to save user first
    @MapsId // tells Hibernate to use the same ID as Users
    @JoinColumn(name = "user_account_id")
    private Users user;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String city;
    private String state;
    private String country;

    @Column(name = "work_authorization")
    private String workAuthorization;

    @Column(name = "employment_type")
    private String employmentType;

    @Column(nullable = true, length = 64, name = "profile_photo")
    private String profilePhoto;

    @OneToMany(targetEntity = Skills.class, cascade = CascadeType.ALL, mappedBy = "jobSeekerProfile")
    private List<Skills> skills;

    public JobSeekerProfile() {}

    public JobSeekerProfile(Users user) {
        this.user = user;
    }

    // Getters & setters (rename userId -> user for clarity)
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
