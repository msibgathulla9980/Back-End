package com.bridgelabz.fundoonotes.utility;

import org.springframework.stereotype.Component;

@Component
public interface TokenGenerator {

	String generateToken(String id);
	   
	 int verifyToken(String token);
}