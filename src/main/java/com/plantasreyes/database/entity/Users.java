package com.plantasreyes.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "User")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Users", unique = true, nullable = false)
	private Long id_Users;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String last_name;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String telephone;
	 
	// constructor vacio para jpa
	public Users() {
}
///definimos relaciones

	@ManyToMany
	@JoinTable(
	name="Products_has_Users",
	joinColumns = @JoinColumn(name = "users_id"),
	inverseJoinColumns = @JoinColumn(name = "Users_users_id")
	)
	
	
	
	//getters y setters
	public Long getId_Users() {
		return id_Users;
	}

	public void setId_Users(Long id_Users) {
		this.id_Users = id_Users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Users [id_Users=" + id_Users + ", name=" + name + ", last_name=" + last_name + ", email=" + email
				+ ", password=" + password + ", username=" + username + ", telephone=" + telephone + "]";
	}

	
	
}