package com.vcube.customerapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vcube.customerapp.model.Customerapp;
import com.vcube.customerapp.repo.Customerrepo;
@Service
public class CustomerServiceImpl implements Customerservice {
	@Autowired
	 Customerrepo customerrepo;

	@Override
	public Customerapp createCustomerData(Customerapp c) {
		return customerrepo.save(c);
	}

	@Override
	public List<Customerapp> getAllCustomerInfo() {
		return customerrepo.findAll();
	}

	@Override
	public Customerapp getCustomer(Integer id) {
		return customerrepo.findById(id).get();
	}

	@Override
	public void deleteCustomer(Integer id) {
		 customerrepo.deleteById(id);	
	}

	@Override
	public Customerapp updateData(Customerapp c, Integer id) {
		
		Customerapp customerFromDB=getCustomer( id);
		
		 customerFromDB.setName(c.getName());
		 customerFromDB.setPhone(c.getPhone());
		 customerFromDB.setEmail(c.getEmail());
		 customerFromDB.setGender(c.getGender());
		 customerFromDB.setCity(c.getCity());
		 return customerrepo.save(customerFromDB);
		 
		 
	
		
		
	}

	@Override
	public Customerapp findByEmail(String email) {
		
		return customerrepo.findByEmail(email) ;
	}
	
	


}
