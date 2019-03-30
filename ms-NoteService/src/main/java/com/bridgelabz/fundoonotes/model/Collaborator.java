package com.bridgelabz.fundoonotes.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table	(name = "Collaborator", uniqueConstraints = @UniqueConstraint(columnNames = { "userId", "noteId" }))
public class Collaborator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id	
	@GeneratedValue
	@Column(name = "collabId")
	private int collabId;
	
	public int getCollabId() {
		return collabId;
	}

	public Collaborator setCollabId(int collabId) {
		this.collabId = collabId;
		return this;

	}
	
	@Column(name = "userId")
	private int userId;

	

	public int getUserId() {
		return userId;
	}

	public Collaborator setUserId(int userId) {
		this.userId = userId;
		return this;
	}
	
	@Column(name = "noteId")
	private int noteId;


	public int getNoteId() {
		return noteId;
	}

	public Collaborator setNoteId(int noteId) {
		this.noteId = noteId;
		return this;

	}
	
	@Column(name = "updatedTime")
	@UpdateTimestamp
	private Timestamp updatedTime;

	public Timestamp getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	@Override
	public String toString() {
		return "Collaborator [collabId=" + collabId + ", userId=" + userId + ", noteId=" + noteId + ", updatedTime="
				+ updatedTime + "]";
	}
}
