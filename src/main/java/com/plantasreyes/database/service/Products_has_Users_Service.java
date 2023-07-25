package com.plantasreyes.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantasreyes.database.entity.Products_has_Users;
import com.plantasreyes.database.repository.Products_has_Users_Repository;

@Service
public class Products_has_Users_Service {
	
	@Autowired
	private Products_has_Users_Repository products_has_users_Repository;
	
	//Get
	public List<Products_has_Users> getAllProducts_has_Users(){
	return products_has_users_Repository.findAll();
	}
	
	//Get by Id
	public Products_has_Users getProducts_has_UsersId(Long id){
	return products_has_users_Repository.findById(id).orElse(null);
	}

	//Post
	public Products_has_Users createProducts_has_Users(Products_has_Users products_has_Users) {
	return products_has_users_Repository.save(products_has_Users);
	}

	//put
	public Products_has_Users updateProducts_has_Users(Products_has_Users products_has_Users) {
	return products_has_users_Repository.save(products_has_Users);
	}

	//DELETE
	public void deleteProducts_has_Users(Long id) {
	products_has_users_Repository.deleteById(id);
	}

}
