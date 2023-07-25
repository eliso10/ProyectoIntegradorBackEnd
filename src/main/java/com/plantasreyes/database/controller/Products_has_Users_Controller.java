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

import com.plantasreyes.database.entity.Products_has_Users;
import com.plantasreyes.database.service.Products_has_Users_Service;

@RequestMapping(path ="/database/products_has_users")
@RestController
public class Products_has_Users_Controller {
	
	@Autowired
	private final Products_has_Users_Service products_has_users_Service;
	
	public Products_has_Users_Controller(Products_has_Users_Service products_has_users_Service) {
		this.products_has_users_Service = products_has_users_Service;
	}
	
	//GetAll
	@GetMapping
	public List<Products_has_Users> getAllProducts_has_Users(){
		return products_has_users_Service.getAllProducts_has_Users();
	}
	
	//Get individual
	@GetMapping("/{id}")
	public Products_has_Users getProducts_has_UsersById(@PathVariable Long id) {
		return products_has_users_Service.getById(id);
	}
	
	//Post
	@PostMapping
	public Products_has_Users createProducts_has_Users (@RequestBody Products_has_Users products) {
		return products_has_users_Service.createProducts_has_Users(products);
	}
	
	//Put
	@PutMapping
	public Products_has_Users updateProducts_has_Users(@RequestBody Products_has_Users products) {
		return products_has_users_Service.updateProducts_has_Users(products);
	}
	
	
	//Delete
	@DeleteMapping("/{id}")
	public void deleteProducts_has_Users(@PathVariable Long id) {
		products_has_users_Service.deleteProducts_has_Users(id);
	}

}
