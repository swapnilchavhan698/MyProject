package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;

@Repository
public class HomeDaoImpl implements HomeDao{

	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("In Dao Layer : " +customer);
		Session session = sf.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		System.out.println("Data Stored...!");
		
	}

	@Override
	public List<Customer> getLoginData(String uname, String pass) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		if("admin".equals(uname) && "admin".equals(pass)) {
			Query<Customer> query = session.createQuery("from Customer");
			List<Customer> clist = query.getResultList();
			return clist;
		}
		return null;
	}

}
