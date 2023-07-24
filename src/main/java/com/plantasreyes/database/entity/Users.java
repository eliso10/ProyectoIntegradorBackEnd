package com.plantasreyes.database.entity;

public class Users {
	private long id_Users;
	private String name;
	private String last_name;
	private String email;
	private String password;
	private String username;
	private String telephone;
	
	public Users() {
}

	public Users(long id_Users, String name, String last_name, String email, String password, String username, String telephone) {
		super();
		this.id_Users=id_Users;
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.username = username;
		this.telephone = telephone;
	}



	public long getId_Users() {
		return id_Users;
	}

	public void setId_Users(long id_Users) {
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