package dao;


import model.Scholingsovereenkomst;

import org.hibernate.Session;

import util.HibernateUtil;

public class ScholingsovereenkomstDAO implements IScholingsovereenkomstDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	public Scholingsovereenkomst findAanmelder(long id) {
		session.beginTransaction();
		Scholingsovereenkomst a = (Scholingsovereenkomst) session.get(Scholingsovereenkomst.class, id);
		session.getTransaction().commit();
		return a;
		
	}

	public void persistAanmelder(Scholingsovereenkomst a) {
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		
	}

	public void updateAanmelder(Scholingsovereenkomst a) {
		session.beginTransaction();
		session.saveOrUpdate(a);
		session.getTransaction().commit();
		
	}
	
	public void deleteAanmelder(Scholingsovereenkomst a) {
		session.beginTransaction();
		session.delete(a);
		session.getTransaction().commit();
		
	}

}
