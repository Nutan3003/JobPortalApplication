package com.CodeWithNew.jobPortal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CodeWithNew.jobPortal.entity.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>  {
	Optional<Users> findByEmail(String email);
  
}
