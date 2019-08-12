package com.tricon.manoram.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.manoram.mongo.model.Users;
//import com.tricon.manoram.mongo.model.repository;

@Service
public class userService {
	@Autowired
	private com.tricon.manoram.mongo.repository.userRepo userRepo;
	
	public String createUser(String id,String uname, String password, String email) {
		Users user = new Users(
				id,
				uname,
				password,
				email
				);
		userRepo.save(user);
		return("New user created with ID: "+user.getId());
				
	}
	public List<Users> listUsers(){
		return userRepo.findAll();
	}

}
