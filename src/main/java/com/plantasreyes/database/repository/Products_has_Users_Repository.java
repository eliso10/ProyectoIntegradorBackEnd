package com.plantasreyes.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plantasreyes.database.entity.Products_has_Users;

@Repository
public interface Products_has_Users_Repository extends JpaRepository<Products_has_Users, Long> {

}
