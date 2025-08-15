package com.CodeWithNew.jobPortal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CodeWithNew.jobPortal.entity.UserType;
import com.CodeWithNew.jobPortal.repository.UserTypeRepository;

@Service
public class UserTypeService {
	private final UserTypeRepository usersTypeRepository ;

	public UserTypeService(UserTypeRepository usersTypeRepository) {
		super();
		this.usersTypeRepository = usersTypeRepository;
	}
	
	public List<UserType> getAll(){
		return  usersTypeRepository.findAll();
	}

	

	
	

}
