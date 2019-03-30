package com.bridgelabz.fundoonotes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.fundoonotes.model.UserDetails;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

	UserDetails findByemailId(String emailId);
	
	List<UserDetails>findAllByEmailId(String email);
	
	UserDetails findUserById(int id);	
		//List<UserDetails> findAll();
	



	

	

	 
	 
	
	
	}	


