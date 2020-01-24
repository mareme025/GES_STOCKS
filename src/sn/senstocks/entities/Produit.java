package sn.senstocks.entities;

import javax.persistence.*;

@Entity
public class Produit
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nom;

    @Column
    private double qteStocks;

    public Produit() {
    }

    public Produit(int id, String nom, double qteStocks) {
        this.id = id;
        this.nom = nom;
        this.qteStocks = qteStocks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQteStocks() {
        return qteStocks;
    }

    public void setQteStocks(double qteStocks) {
        this.qteStocks = qteStocks;
    }
}
