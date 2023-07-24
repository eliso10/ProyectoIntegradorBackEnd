package com.plantasreyes.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantasreyes.database.entity.Products;
import com.plantasreyes.database.service.ProductsService;

@RequestMapping
@RestController
public class ProductsController {
	private final ProductsService productsService;
	
	@Autowired
	public ProductsController(ProductsService productsService) {
		this.productsService = productsService;
	}
	
	@GetMapping
	public List<Products> getProduct(){
		return productsService.getProducts();
	}
}
