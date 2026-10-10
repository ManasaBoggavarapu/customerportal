package com.vcube.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.customerapp.model.Customerapp;
import com.vcube.customerapp.service.Customerservice;
   
@RestController
@RequestMapping("/customer")
public class CustomerController{
	@Autowired
	Customerservice customerservice;
	
	
	@DeleteMapping("/delete/{id}")
	      String  deleteCustomer(@PathVariable Integer id )
	  {
		  customerservice.deleteCustomer(id);
		  
		  return "Customer " + id + "is deleted successfully ";
	  }
	
	
	 @GetMapping("/getCustomers")
	 List<Customerapp> getAllCustomers()
	 {
		 return customerservice.getAllCustomerInfo();
	 }
	 
	 @GetMapping("/getCus/{id}")
	  Customerapp getcustomerid(@PathVariable Integer id)
	  {
		 return customerservice.getCustomer(id);
	  }

	 
	 @GetMapping("/getCus/email/{email}")
	  Customerapp findByEmail(@PathVariable String email )
	  {
		 return customerservice.findByEmail(email);
		 
	  }
	 
	 @PutMapping("/update/{id}")
	  Customerapp   updateCustomer(@RequestBody Customerapp c,@PathVariable Integer id)
	  {
		 return customerservice.updateData(c, id);
	  }

	
	@GetMapping("/wel")
	String welcome() {
		return"WELCOME TO SPRING BOOT WORLD!!!GUYS IT'S DAMN EASY :) ";
	}
	@PostMapping("/create")
    Customerapp	createCustomerInfo(@RequestBody Customerapp c) {
    return customerservice.createCustomerData(c);
    }
}
