package hm.sb_namedates_rest_Homework1.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.SelectionQuery;
import org.springframework.stereotype.Repository;

import hm.sb_namedates_rest_Homework1.model.NameDate;

@Repository
public class Database {

	private SessionFactory sessionFactory;
	
	public Database() {
		
		Configuration config = new Configuration();
		config.configure();
		
		this.sessionFactory = config.buildSessionFactory();
	}

	public List<NameDate> getNameDates() {
		
		List<NameDate> nameDatesList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		SelectionQuery<NameDate> query = 
				session.createSelectionQuery("SELECT n FROM NameDate n", NameDate.class);
		
		nameDatesList = query.getResultList();
		
		tx.commit();
		session.close();
		
		return nameDatesList;
	}
	
	
	
	
	
	
	
}
