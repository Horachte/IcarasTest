package dao;

import model.Opleiding;


import org.hibernate.Session;

import util.HibernateUtil;

public class OpleidingDAO implements IOpleidingDAO{
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	public Opleiding findAanmelder(long id) {
		session.beginTransaction();
		Opleiding a = (Opleiding) session.get(Opleiding.class, id);
		session.getTransaction().commit();
		return a;
		
	}

	public void persistAanmelder(Opleiding a) {
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		
	}

	public void updateAanmelder(Opleiding a) {
		session.beginTransaction();
		session.saveOrUpdate(a);
		session.getTransaction().commit();
		
	}

	public void deleteAanmelder(Opleiding a) {
		session.beginTransaction();
		session.delete(a);
		session.getTransaction().commit();
		
	}

}
