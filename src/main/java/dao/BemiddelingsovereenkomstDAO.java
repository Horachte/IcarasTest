package dao;



import model.Bemiddelingsovereenkomst;

import org.hibernate.Session;

import util.HibernateUtil;

public class BemiddelingsovereenkomstDAO implements IBemiddelingsovereenkomstDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	public Bemiddelingsovereenkomst findAanmelder(long id) {
		session.beginTransaction();
		Bemiddelingsovereenkomst a = (Bemiddelingsovereenkomst) session.get(Bemiddelingsovereenkomst.class, id);
		session.getTransaction().commit();
		return a;
		
	}

	public void persistAanmelder(Bemiddelingsovereenkomst a) {
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		
	}

	public void updateAanmelder(Bemiddelingsovereenkomst a) {
		session.beginTransaction();
		session.saveOrUpdate(a);
		session.getTransaction().commit();
		
	}
	
	public void deleteAanmelder(Bemiddelingsovereenkomst a) {
		session.beginTransaction();
		session.delete(a);
		session.getTransaction().commit();
		
	}

}
