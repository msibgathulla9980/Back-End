package com.bridgelabz.fundoonotes.utility;

import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator implements TokenGenerator{
	
//	private static Logger log = Logger.getLogger(JwtGenerator.class);
	
	public String generateToken(String id) {
		return Jwts.builder().setId(id).claim("roles", "existingUser").setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secretKey").compact();
	}

	public int verifyToken(String token) {
		
		
		Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary("secretKey")).parseClaimsJws(token).getBody();
        
		//log.info("ID: " + claims.getId());
		
//		System.out.println("ID: " + claims.getId());

		return Integer.parseInt(claims.getId());

	}

}

