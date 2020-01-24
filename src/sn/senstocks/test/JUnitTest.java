package sn.senstocks.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sn.senstocks.dao.IProduit;
import sn.senstocks.dao.ProduitImpl;
import sn.senstocks.entities.Produit;

public class JUnitTest
{
    @Before
    public void beforeTest()
    {
        System.out.println("==========BEFORE=============");
    }

    @After
    public void afterTest()
    {
        System.out.println("==========AFTER=============");
    }

    @Test
    public void testAddProduit()
    {
        IProduit produitdao = new ProduitImpl();
        Produit produit = new Produit();
        produit.setNom("Table");
        produit.setQteStocks(100);
        produitdao.add(produit);
        System.out.println("==========TEST=============");
    }
}
