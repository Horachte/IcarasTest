package dao;


import model.CV;

import org.hibernate.Session;

import util.HibernateUtil;

public class CVDAO implements ICVDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	public CV findCV(long id) {
		session.beginTransaction();
		CV a = (CV) session.get(CV.class, id);
		session.getTransaction().commit();
		return a;
		
	}

	public void persistAanmelder(CV cv) {
		session.beginTransaction();
		session.save(cv);
		session.getTransaction().commit();
		
	}

	public void updateAanmelder(CV cv) {
		session.beginTransaction();
		session.saveOrUpdate(cv);
		session.getTransaction().commit();
		
	}

	public void deleteAanmelder(CV cv) {
		session.beginTransaction();
		session.delete(cv);
		session.getTransaction().commit();
		
	}

}
