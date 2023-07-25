package com.plantasreyes.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Products_has_Users")

public class Products_has_Users {
	
	@Column(nullable=false)
	private int quantity;
	
	public Products_has_Users() {
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
