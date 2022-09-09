package com.ex.userapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.userapp.beans.Responce;
import com.ex.userapp.beans.User;
import com.ex.userapp.entities.UserEntitry;
import com.ex.userapp.model.UserModel;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserModel model;

	@PostMapping("/save")
	public Responce saveUser(@RequestBody User user) {
		model.saveUser(user);
		Responce responce= new Responce();
		responce.setMessage("success");
		responce.setStatus(200);
		return responce;
	}
	@GetMapping("fetchallusers")
	public Responce fetchAllUsers() {
		List<UserEntitry> list= model.getAllUsers();
		Responce responce= new Responce();
		responce.setMessage("success");
		responce.setStatus(200);
		responce.setData(list);
		return responce;
	}
}
