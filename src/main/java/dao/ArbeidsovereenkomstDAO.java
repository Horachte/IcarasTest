package dao;

import model.Arbeidsovereenkomst;


import org.hibernate.Session;

import util.HibernateUtil;

public class ArbeidsovereenkomstDAO implements IArbeidsovereenkomstDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	public Arbeidsovereenkomst findAanmelder(long id) {
		session.beginTransaction();
		Arbeidsovereenkomst a = (Arbeidsovereenkomst) session.get(Arbeidsovereenkomst.class, id);
		session.getTransaction().commit();
		return a;
		
	}

	public void persistAanmelder(Arbeidsovereenkomst a) {
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		
	}

	public void updateAanmelder(Arbeidsovereenkomst a) {
		session.beginTransaction();
		session.saveOrUpdate(a);
		session.getTransaction().commit();
		
	}

	public void deleteAanmelder(Arbeidsovereenkomst a) {
		session.beginTransaction();
		session.delete(a);
		session.getTransaction().commit();
		
	}

}
