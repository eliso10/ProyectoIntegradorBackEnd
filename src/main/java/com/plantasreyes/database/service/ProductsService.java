package com.plantasreyes.database.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.plantasreyes.database.entity.Products;

@Service
public class ProductsService {
	public final ArrayList<Products> list = new ArrayList<Products>();
	
	public ArrayList<Products> getProducts(){
		return list;
	}
}
