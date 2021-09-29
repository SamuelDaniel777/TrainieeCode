package com.yash.demohiber.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Save {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Person.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t = session.beginTransaction();
		Person p = new Person();
		
		p.setId(1);
		session.delete(p);
		t.commit();
		
		session.close();
		sf.close();
		
	}
}
