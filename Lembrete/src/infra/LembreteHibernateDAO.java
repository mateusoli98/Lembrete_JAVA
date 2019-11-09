package infra;

import javax.persistence.EntityManager;
import model.Lembrete;

public class LembreteHibernateDAO implements ILembreteDAO {

    @Override
    public boolean create(Lembrete lembrete) {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(lembrete);
            em.getTransaction().commit();
        } catch (Exception e) {
            return false;
        } finally {
            em.close();
        }
        return true;
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
