package com.plantasreyes.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plantasreyes.database.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
