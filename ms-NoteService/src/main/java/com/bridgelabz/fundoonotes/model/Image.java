package com.bridgelabz.fundoonotes.model;

import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Image")
public class Image {
	

	@Id
	@GeneratedValue
	@Column(name = "imageId")
	private int imageId;
	
	public int getImageId() {
		return imageId;
	}

	public Image setImageId(int imageId) {
		this.imageId = imageId;
		return this;
	}
	
	@Column(name = "noteId")
	private int noteId;
	
	public int getNoteId() {
		return noteId;
	}

	public Image setNoteId(int noteId) {
		this.noteId = noteId;
    	return this;
	}
	
	@Lob
	@Column(name = "Image")
	private  byte[] image;
 

	public byte[] getImage() {
		return image;
	}

	public Image setImage(byte[] image) {
		this.image = image;
		return this;
	}

	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", noteId=" + noteId + ", image=" + Arrays.toString(image) + "]";
	}
	
	

}
