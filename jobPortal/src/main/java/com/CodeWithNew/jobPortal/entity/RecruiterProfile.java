package com.CodeWithNew.jobPortal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="recruiter_profile")
public class RecruiterProfile {
	@Id
	private int user_account_id ;
	@OneToOne
	@JoinColumn(name="user_account_id")
	@MapsId
	private Users userId;
	private String first_name;
	private String last_name;
	private String city;
	private String state;
	private String country;
	private String company;
	@Column(nullable=true,length=64)
	private String profilePhoto;
	public RecruiterProfile(int user_account_id, Users userId, String first_name, String last_name, String city,
			String state, String country, String company, String profilePhoto) {
		super();
		this.user_account_id = user_account_id;
		this.userId = userId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.company = company;
		this.profilePhoto = profilePhoto;
	}
	public RecruiterProfile(Users users) {
		// TODO Auto-generated constructor stub
		this.userId=users;
	}
		// TODO Auto-generated constructor stub
	
	public int getUser_account_id() {
		return user_account_id;
	}
	public void setUser_account_id(int user_account_id) {
		this.user_account_id = user_account_id;
	}
	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	@Override
	public String toString() {
		return "RecruiterProfile [user_account_id=" + user_account_id + ", userId=" + userId + ", first_name="
				+ first_name + ", last_name=" + last_name + ", city=" + city + ", state=" + state + ", country="
				+ country + ", company=" + company + ", profilePhoto=" + profilePhoto + "]";
	}
	

}
//CREATE TABLE `recruiter_profile` (
//		  `user_account_id` int NOT NULL,
//		  `city` varchar(255) DEFAULT NULL,
//		  `company` varchar(255) DEFAULT NULL,
//		  `country` varchar(255) DEFAULT NULL,
//		  `first_name` varchar(255) DEFAULT NULL,
//		  `last_name` varchar(255) DEFAULT NULL,
//		  `profile_photo` varchar(64) DEFAULT NULL,
//		  `state` varchar(255) DEFAULT NULL,
//		  PRIMARY KEY (`user_account_id`),
//		  CONSTRAINT `FK42q4eb7jw1bvw3oy83vc05ft6` FOREIGN KEY (`user_account_id`) REFERENCES `users` (`user_id`)
//		) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;