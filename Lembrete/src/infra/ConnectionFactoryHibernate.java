package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactoryHibernate {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("LembretePU");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return emf.createEntityManager();
    }
}
