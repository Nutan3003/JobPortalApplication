package com.CodeWithNew.jobPortal.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="skills")
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String experienceLevel;
	private String yearOfExperience;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="job_seeker_profile")
	private JobSeekerProfile jobSeekerProfile;
	
	public Skills() {
		
	}

	public Skills(int id, String name, String experienceLevel, String yearOfExperience,
			JobSeekerProfile jobSeekerProfile) {
		super();
		this.id = id;
		this.name = name;
		this.experienceLevel = experienceLevel;
		this.yearOfExperience = yearOfExperience;
		this.jobSeekerProfile = jobSeekerProfile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperienceLevel() {
		return experienceLevel;
	}

	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	}

	public String getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public JobSeekerProfile getJobSeekerProfile() {
		return jobSeekerProfile;
	}

	public void setJobSeekerProfile(JobSeekerProfile jobSeekerProfile) {
		this.jobSeekerProfile = jobSeekerProfile;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", experienceLevel=" + experienceLevel + ", yearOfExperience="
				+ yearOfExperience + ", jobSeekerProfile=" + jobSeekerProfile + "]";
	}
	

}



//CREATE TABLE `skills` (
//		  `id` int NOT NULL AUTO_INCREMENT,
//		  `experience_level` varchar(255) DEFAULT NULL,
//		  `name` varchar(255) DEFAULT NULL,
//		  `years_of_experience` varchar(255) DEFAULT NULL,
//		  `job_seeker_profile` int DEFAULT NULL,
//		  PRIMARY KEY (`id`),
//		  KEY `FKsjdksau8sat30c00aqh5xf2wh` (`job_seeker_profile`),
//		  CONSTRAINT `FKsjdksau8sat30c00aqh5xf2wh` FOREIGN KEY (`job_seeker_profile`) REFERENCES `job_seeker_profile` (`user_account_id`)
//		) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
