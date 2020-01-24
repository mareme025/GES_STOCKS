package sn.senstocks.test;

import sn.senstocks.dao.IProduit;
import sn.senstocks.dao.ProduitImpl;
import sn.senstocks.entities.Produit;

public class Test
{
    public static void main(String[] args)
    {
        IProduit produitdao = new ProduitImpl();
        Produit produit = new Produit();
        produit.setNom("Ordinateur");
        produit.setQteStocks(25);
        int ok =produitdao.add(produit);
        System.out.println(ok);
    }
}
