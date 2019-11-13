package infra;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Lembrete;

public class LembreteHibernateDAO implements ILembreteDAO {

    @Override
    public boolean create(Lembrete lembrete) {
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(lembrete);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
        return false;
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
    public List<Lembrete> read() {
        List<Lembrete> listaLembrete = new ArrayList<>();
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();

        try {
            em.getTransaction().begin();
            Query query = em.createQuery("from Lembrete");
            listaLembrete = query.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
        return listaLembrete;
    }

}
