package com.vcube.customerapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.customerapp.model.Customerapp;
@Repository
public interface Customerrepo extends JpaRepository<Customerapp, Integer>{
	
	Customerapp findByEmail(String email);

}
