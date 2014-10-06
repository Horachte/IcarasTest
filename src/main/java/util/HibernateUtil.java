package util;


import model.Aanmelder;
import model.Arbeidsovereenkomst;
import model.Bemiddelingsovereenkomst;
import model.CV;
import model.Opleiding;
import model.Scholingsovereenkomst;
import model.WerkervaringsEenheid;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
        try {
              	
        	Configuration config = new Configuration();
            config.configure();
            config.addAnnotatedClass(Aanmelder.class);
            config.addAnnotatedClass(CV.class);
            config.addAnnotatedClass(WerkervaringsEenheid.class);
            config.addAnnotatedClass(Opleiding.class);
            config.addAnnotatedClass(Arbeidsovereenkomst.class);
            config.addAnnotatedClass(Bemiddelingsovereenkomst.class);
            config.addAnnotatedClass(Scholingsovereenkomst.class);
            
            ServiceRegistry registry = new StandardServiceRegistryBuilder()
            .applySettings(config.getProperties())
            .build();
                        
            return config.buildSessionFactory(registry);
        	
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

}
