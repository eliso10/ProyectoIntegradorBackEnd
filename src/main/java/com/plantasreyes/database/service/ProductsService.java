package com.plantasreyes.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantasreyes.database.entity.CategoryProduct;
import com.plantasreyes.database.entity.Products;
import com.plantasreyes.database.repository.CategoryProductRepository;
import com.plantasreyes.database.repository.ProductsRepository;

@Service
public class ProductsService {
	
	private final ProductsRepository productsRepository;
	private final CategoryProductRepository categoryProductRepository;

	@Autowired
	 public ProductsService(ProductsRepository productoRepository, CategoryProductRepository categoryProductRepository) {
	        this.productsRepository = productoRepository;
	        this.categoryProductRepository = categoryProductRepository;
	    }
	
	public Products postProduct(Products products, Long categoriaId) {
		CategoryProduct categoria = categoryProductRepository.findById(categoriaId).orElseThrow(() -> new IllegalArgumentException("Categoría no encontrada"));

        products.setCategoryProduct(categoria);
        return productsRepository.save(products);
    }
	
	//Get
	public List<Products> getAllProducts(){
		return productsRepository.findAll();

	}
	
	//Get by Id
	public Products getProductsById(Long id) {
		return productsRepository.findById(id).orElse(null);
	}
	
	//Post
	public Products createProducts(Products products) {
		return productsRepository.save(products);
	}
	
	// Put
	public Products updateProducts(Products products) {
		return productsRepository.save(products);
	}
	
	//Delete (necesario por id)
	public void deleteProducts(Long id) {
		productsRepository.deleteById(id);
	}

	public Products creatProduct(Products producto) {
		 Long categoriaId = producto.getCategoryProduct().getId_category();
		 CategoryProduct categoria = categoryProductRepository.findById(categoriaId)
	                .orElseThrow(() -> new IllegalArgumentException("Categoría no encontrada"));

	        producto.setCategoryProduct(categoria);
	        return productsRepository.save(producto);
	}
	
	
}
