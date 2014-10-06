package dao;


import model.WerkervaringsEenheid;

import org.hibernate.Session;

import util.HibernateUtil;

public class WerkervaringseenheidDAO implements IWerkervaringseenheidDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	public WerkervaringsEenheid findAanmelder(long id) {
		session.beginTransaction();
		WerkervaringsEenheid a = (WerkervaringsEenheid) session.get(WerkervaringsEenheid.class, id);
		session.getTransaction().commit();
		return a;
		
	}

	public void persistAanmelder(WerkervaringsEenheid a) {
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		
	}

	public void updateAanmelder(WerkervaringsEenheid a) {
		session.beginTransaction();
		session.saveOrUpdate(a);
		session.getTransaction().commit();
		
	}

	public void deleteAanmelder(WerkervaringsEenheid a) {
		session.beginTransaction();
		session.delete(a);
		session.getTransaction().commit();
		
	}

}
