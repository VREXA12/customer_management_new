package com.cg.apps.customermsnew.services;

import com.cg.apps.customermsnew.entities.Customer;

public interface ICustomerService {
	public Customer findById(long customerID);
	public Customer createCustomer(String name);
    public Customer addAmount(Long id,double amount);
 
}
