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


import com.plantasreyes.database.entity.Products;
import com.plantasreyes.database.service.ProductsService;

@RequestMapping(path = "/database/products")
@RestController
public class ProductsController {
	
	
	private final ProductsService productsService;
	
	
	
	@Autowired
	public ProductsController(ProductsService productsService) {
		this.productsService = productsService;
		
	}
	
	// Método para crear un nuevo producto con una categoría ya existente
    @PostMapping("/crear-con-categoria-existente")
    public Products creatProduct(@RequestBody Products producto) {
        return productsService.creatProduct(producto);
    }
	
	// Método para crear un nuevo producto y asignarle una categoría
    @PostMapping("/post/{categoriaId}")
    public Products crearProductoConCategoria(@RequestBody Products producto, @PathVariable Long categoriaId) {
        return productsService.postProduct(producto, categoriaId);
    }
	
	//GetAll
	@GetMapping
	public List<Products> getAllProducts(){
		return productsService.getAllProducts();
	}
	
	//Get individual
	@GetMapping("/{id}")
	public Products getProductsById(@PathVariable Long id) {
		return productsService.getProductsById(id);
	}
	/*
	//Post
	@PostMapping
	public Products createProducts (@RequestBody Products products) {
		CategoryProduct persistentCategoryProduct = categoryProductRepository.findById(products.getCategoryProduct().getId_category()).orElse(null);
		products.setCategoryProduct(persistentCategoryProduct);
		return productsService.createProducts(products);
	}
	*/
	//Put
	@PutMapping
	public Products updateProducts(@RequestBody Products products) {
		return productsService.updateProducts(products);
	}
	
	
	//Delete
	@DeleteMapping("/{id}")
	public void deleteProducts(@PathVariable Long id) {
		productsService.deleteProducts(id);
	}
}
