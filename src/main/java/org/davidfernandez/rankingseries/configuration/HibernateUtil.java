package org.davidfernandez.rankingseries.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Crear la instancia de Configuration a partir de hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure();

            // Crear la instancia de SessionFactory
            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            // Manejar cualquier excepción
            System.err.println("Error al crear SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
