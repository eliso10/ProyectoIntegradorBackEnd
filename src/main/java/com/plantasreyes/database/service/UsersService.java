package com.plantasreyes.database.service;

import java.util.ArrayList;

import com.bookstore.bookstore.Entity.Users;


public class UsersService {
	//acomodar servicio para recibir info desde la base de datos 
		public final ArrayList<Users> Lista = new ArrayList<Users>();
		// paquetes pendientes
		//obtener
		public ArrayList<Users>getUsers(){
			return Lista;
		}
}
