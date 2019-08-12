package com.tricon.manoram.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.manoram.mongo.service.userService;

@RestController
@RequestMapping("/users")
public class userControllers {
	@Autowired
	private userService userService;
	@PostMapping("/add")
	public String createUser(
			@RequestParam("id") String id,
			@RequestParam("username") String uname,
			@RequestParam("password") String password,
			@RequestParam("emailId") String email
			) {
		return userService.createUser(id, uname, password, email);
	}
	
	@GetMapping("/list")
	public List<?> listUsers(){
		return userService.listUsers();
	}
	

}
