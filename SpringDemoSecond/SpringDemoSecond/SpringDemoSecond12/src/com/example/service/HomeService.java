package com.example.service;

import java.util.List;

import com.example.entity.Customer;

public interface HomeService {

	void addCutomerData(Customer customer);
	
	List<Customer> getLoginData(String uname,String pass);
}
