package com.jk.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		Student s1 = new Student();
//		s1.setId(6);
//		s1.setName("Test5");
//
//		session.save(s1);
//		t.commit();
//		System.out.println("successfully saved");
		
		Student s2 = session.find(Student.class, 5);
				
		System.out.println("Name:" + s2.getName());
		
		factory.close();
		session.close();

	}

}
