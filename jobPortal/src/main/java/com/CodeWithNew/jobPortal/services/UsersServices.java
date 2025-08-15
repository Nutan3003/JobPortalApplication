package com.CodeWithNew.jobPortal.services;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodeWithNew.jobPortal.entity.JobSeekerProfile;
import com.CodeWithNew.jobPortal.entity.RecruiterProfile;
import com.CodeWithNew.jobPortal.entity.Users;
import com.CodeWithNew.jobPortal.repository.JobSeekerProfileRepository;
import com.CodeWithNew.jobPortal.repository.RecruiterProfileRepository;
import com.CodeWithNew.jobPortal.repository.UsersRepository;

import jakarta.validation.Valid;

@Service
public class UsersServices {
	
	private final UsersRepository usersRepository ;
	private final JobSeekerProfileRepository jobSeekerProfileRepository;
    private final RecruiterProfileRepository recruiterProfileRepository;
//	@Autowired
//	public UsersServices(UsersRepository usersRepository) {
//		super();
//		this.usersRepository = usersRepository;
//		
//	}
	
	
	@Autowired
	public UsersServices(UsersRepository usersRepository, JobSeekerProfileRepository jobSeekerProfileRepository,
			RecruiterProfileRepository recruiterProfileRepository) {
		super();
		this.usersRepository = usersRepository;
		this.jobSeekerProfileRepository = jobSeekerProfileRepository;
		this.recruiterProfileRepository = recruiterProfileRepository;
	}



	public Users addNew(Users users) {
		users.setActive(true);
		users.setRegistrationDate(new Date(System.currentTimeMillis()));
		Users savedUser=usersRepository.save(users);
		int userTypeId=users.getUserTypeId().getUserTypeId();
		if(userTypeId == 1) {
			recruiterProfileRepository.save(new RecruiterProfile(users));
		}else {
			jobSeekerProfileRepository.save(new JobSeekerProfile(users));
		}
		return savedUser;
	}

	public Optional<Users> getUserByEmail(String email){
		return usersRepository.findByEmail(email);
	}
	
	

}
