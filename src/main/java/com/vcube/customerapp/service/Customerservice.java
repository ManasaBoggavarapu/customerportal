package com.vcube.customerapp.service;



import java.util.List;

import com.vcube.customerapp.model.Customerapp;

public interface Customerservice {

    public abstract Customerapp createCustomerData(Customerapp c);

    public abstract List<Customerapp> getAllCustomerInfo();

    public abstract Customerapp getCustomer(Integer id);
    
    public abstract void deleteCustomer(Integer id);

    public abstract Customerapp updateData(Customerapp c,Integer id);
    
    Customerapp findByEmail(String email);

}
