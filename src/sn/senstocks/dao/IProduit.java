package sn.senstocks.dao;

import sn.senstocks.entities.Produit;

import java.util.List;

public interface IProduit
{
    public int add(Produit produit);
    public List<Produit> list();
}
