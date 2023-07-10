package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HomeDao;
import com.example.entity.Customer;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private HomeDao hd; 
	

	@Override
	public void addCutomerData(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("In Service Layer : "  + customer);
		hd.addCustomerData(customer);
	}

}
