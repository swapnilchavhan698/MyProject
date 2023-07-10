package com.example.dao;

import java.util.List;

import com.example.entity.Customer;

public interface HomeDao {

	void addCustomerData(Customer customer);
	
	List<Customer> getLoginData(String uname,String pass);
}
