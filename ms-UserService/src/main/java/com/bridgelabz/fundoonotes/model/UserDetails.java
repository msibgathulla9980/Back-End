package com.bridgelabz.fundoonotes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name= "UserDetails")
public class UserDetails implements Serializable
{

	@Id//indicates it is primary key	
	@GeneratedValue
	@Column(name = "id")
	private int id;

	public int getId() {
		return id;
	}

	public UserDetails setId(int id) {
		this.id = id;
		return this;
	}

	@Column(name="activation_status")
	private boolean activationStatus;

	public boolean isActivationStatus() {
		return activationStatus;
	}

	public UserDetails setActivationStatus(boolean activationStatus) {
		this.activationStatus = activationStatus;
		return this;
	}

	@Column(name = "name")
	private String name;		


	public String getName() {
		return name;
	}

	public UserDetails setName(String name) {
		this.name = name;
		return this;
	}
	
	@Column(name = "emailId", unique = true)
	private String emailId;

	public String getEmailId() {
		return emailId;
	}

	public UserDetails setEmailId(String emailId) {
		this.emailId = emailId;
		return this;
	}
	
	@Column(name = "password",length = 60)
	private String password;


	public String getPassword() {
		return password;
	}

	public UserDetails setPassword(String password) {
		this.password = password;
		return this;
	}
	
	@Column(name = "mobileNumber")
	private long mobileNumber;


	public long getMobileNumber() {
		return mobileNumber;
	}

	public UserDetails setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	
	@Lob
	 private byte[] image;
	
	public byte[] getImage() {
		return image;
	}

	public UserDetails setImage(byte[] image) {
		this.image = image;
		return this;
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password
				+ ", mobileNumber=" + mobileNumber+"]";
	}

		
	
	
}

