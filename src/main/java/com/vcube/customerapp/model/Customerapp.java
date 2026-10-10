package com.vcube.customerapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table()
@Setter
@Getter
@NoArgsConstructor
public class Customerapp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Integer id;

	String name;

	Long phone;
	String email;
	String gender;
	String city;

	
}
