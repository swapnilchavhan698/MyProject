package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Customer;
import com.example.service.HomeService;


@Controller
public class HomeController {
	
	@Autowired
	private HomeService hs;

	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam("uname") String un,@RequestParam("pass") String ps,Model model) {
		System.out.println("Login Credentials : " + un + "  " + ps);
		List<Customer> clist = hs.getLoginData(un, ps);
		if(clist != null) {
			model.addAttribute("customerlist", clist);
			return "success";
		}
		return "login";
	}
	
	@RequestMapping(value = "reg")
	public String getRegisterdData(@ModelAttribute Customer customer) {
		System.out.println("Get Registered Data : " + customer);
		hs.addCutomerData(customer);
		return "login";
	}
}
