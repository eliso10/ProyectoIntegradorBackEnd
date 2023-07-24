package com.plantasreyes.database.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.Service.BookService;
import com.bookstore.bookstore.Service.UsersService;
import com.plantasreyes.database.entity.*;
@RequestMapping(path="/bookstore/books")
@RestController

public class UsersController{

	private final UsersService usersService;
	
	@Autowired
	public UsersController(UsersService usersService) {
		this.usersService= usersService;
		}

	@getMapping
	public list <Users> getUsers(){
		return usersService.getUsers();//aqui va que quiero retornar();
	}
}
