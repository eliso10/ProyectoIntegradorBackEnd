package com.plantasreyes.database.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantasreyes.database.entity.Users;
import com.plantasreyes.database.service.UsersService;
@RequestMapping(path="/database/users")
@RestController

public class UsersController{

	@Autowired
	private final UsersService usersService;
	
	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}
	
	//GetAll
	@GetMapping
	public List<Users> getAllUsers(){
		return usersService.getAllUsers();
	}
	
	//Get individual
	@GetMapping("/{id}")
	public Users getUsersById(@PathVariable Long id) {
		return usersService.getUsersById(id);
	}
	
	//Post
	@PostMapping
	public Users createUsers (@RequestBody Users users) {
		return usersService.createUsers(users);
	}
	
	//Put
	@PutMapping
	public Users updateUsers(@RequestBody Users users) {
		return usersService.updateUsers(users);
	}
	
	
	//Delete
	@DeleteMapping("/{id}")
	public void deleteUsers(@PathVariable Long id) {
		usersService.deleteUsers(id);
	}
}
