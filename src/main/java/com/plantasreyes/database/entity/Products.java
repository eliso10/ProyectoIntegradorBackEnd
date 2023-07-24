package com.plantasreyes.database.entity;

public class Products {
	//Attributes
	private Long id_products;
	private String product_name;
	private String url;
	private String description;
	
	
	//constructores
	//para el JPA
	public Products() {
		
	}
	
	//Automaticos
	public Products(Long id_products, String product_name, String url, String description) {
		super();
		this.id_products = id_products;
		this.product_name = product_name;
		this.url = url;
		this.description = description;
	}
	
	//getters y setters
	public Long getId_products() {
		return id_products;
	}

	public void setId_products(Long id_products) {
		this.id_products = id_products;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Products [id_products=" + id_products + ", product_name=" + product_name + ", url=" + url
				+ ", description=" + description + "]";
	}
	
	
	
}
