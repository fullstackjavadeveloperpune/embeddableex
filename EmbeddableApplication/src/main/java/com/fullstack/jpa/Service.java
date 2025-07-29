package com.fullstack.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {

	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {

		Service service = new Service();

		service.saveData();
	}

	void saveData() {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Address address = new Address("AMANORA MALL", "PUNE", "MH", "INDIA", 411028);

		Employee employee = new Employee("LAKSHMI", 77898989898L, 99000.96, address);

		session.save(employee);

		transaction.commit();

	}
	
	

}
