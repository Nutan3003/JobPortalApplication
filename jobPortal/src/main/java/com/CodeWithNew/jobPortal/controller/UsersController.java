package com.CodeWithNew.jobPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.CodeWithNew.jobPortal.entity.UserType;
import com.CodeWithNew.jobPortal.entity.Users;
import com.CodeWithNew.jobPortal.services.UserTypeService;
import com.CodeWithNew.jobPortal.services.UsersServices;

import jakarta.validation.Valid;



@Controller
public class UsersController {
	
	private final UserTypeService usersTypeService;
		private final UsersServices usersService;

	@Autowired
	public UsersController(UserTypeService usersTypeService,UsersServices usersService) {
		super();
		this.usersTypeService = usersTypeService;
		this.usersService=usersService;
	}

	@GetMapping("/register")
	public String register(Model model) {
//		List<UserType> usersTypes = usersTypeService.getAll();
//	
		List<UserType> usersTypes = usersTypeService.getAll();  // no cast needed
		model.addAttribute("getAllType", usersTypes);  
	   // System.out.println("User types from DB: " + usersTypes); 
       model.addAttribute("user", new Users());
		return "register";
		
	}
	
	@PostMapping("/register/new")
	public String userRegistration(@Valid Users users,Model model) {
		//System.out.println("User::"+users);
		
		
		Optional<Users>optionalUsers=usersService.getUserByEmail(users.getEmail());
		 if(optionalUsers.isPresent()) {
			 model.addAttribute("error","Email already registered,try to login or register with other email.");
			 List<UserType> usersTypes = usersTypeService.getAll();  // no cast needed
				model.addAttribute("getAllType", usersTypes);  
			   // System.out.println("User types from DB: " + usersTypes); 
		       model.addAttribute("user", new Users());
				return "register";
		 }
		usersService.addNew(users);
		return "dashboard";
		
	}
}
