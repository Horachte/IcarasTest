package dao;



import org.hibernate.Session;
import model.Aanmelder;
import util.HibernateUtil;

public class AanmelderDAO implements IAanmelderDAO {
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	public Aanmelder findAanmelder(long id) {
		session.beginTransaction();
		Aanmelder a = (Aanmelder) session.get(Aanmelder.class, id);
		session.getTransaction().commit();
		return a;
		
	}

	public void persistAanmelder(Aanmelder aanmelder) {
		session.beginTransaction();
		session.save(aanmelder);
		session.getTransaction().commit();
		
	}

	public void updateAanmelder(Aanmelder aanmelder) {
		session.beginTransaction();
		session.saveOrUpdate(aanmelder);
		session.getTransaction().commit();
		
	}

	public void deleteAanmelder(Aanmelder aanmelder) {
		session.beginTransaction();
		session.delete(aanmelder);
		session.getTransaction().commit();
		
	}


}
