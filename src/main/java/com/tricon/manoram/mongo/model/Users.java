package com.tricon.manoram.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "manoram")
public class Users {
	@Id
	private String id;
	private String username;
	private String password;
	private String emailId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Users(String id, String username, String password, String emailId) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
	}
	
	

}
