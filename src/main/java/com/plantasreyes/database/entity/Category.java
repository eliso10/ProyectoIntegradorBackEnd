package com.plantasreyes.database.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Category")
public class Category {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_category", unique = true, nullable = false)
	private Long id_category;
	
	@Column(nullable = false)
	private String name_category;

	public Category() {
	}

	public Long getId_category() {
		return id_category;
	}

	public void setId_category(Long id_category) {
		this.id_category = id_category;
	}

	public String getName_category() {
		return name_category;
	}

	public void setName_category(String name_category) {
		this.name_category = name_category;
	}

	
	
	
	

}
