package com.cg.apps.customermsnew.dao;

import com.cg.apps.customermsnew.entities.Customer;

public interface ICustomerDao {
	public Customer add(Customer customer);
	public Customer findById(Long customerID);
	public Customer update(Customer customer);
}
