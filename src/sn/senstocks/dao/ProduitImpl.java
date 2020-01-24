package sn.senstocks.dao;

import sn.senstocks.entities.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProduitImpl implements IProduit
{
    private EntityManager em;
    /*EntityManagerFactory permet de selectioner notre unite de Persistence (JPA)*/
    public ProduitImpl()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("STOCKSPU");
        em=emf.createEntityManager();
    }
    @Override
    public int add(Produit produit)
    {
        try {
             em.getTransaction().begin();
             em.persist(produit);
             em.getTransaction().commit();
             return 1;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<Produit> list() {
        return em.createQuery("SELECT p FROM Produit p").getResultList();
    }
}
