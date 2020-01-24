package sn.senstocks.controller;

import sn.senstocks.dao.IProduit;
import sn.senstocks.dao.ProduitImpl;
import sn.senstocks.entities.Produit;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*@WebServlet permet de definir le modele d'url patterns à utiliser*/
@WebServlet(urlPatterns = "/Produit", name = "produit")
public class ProduitServlet extends HttpServlet
{
    private IProduit produitdao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        produitdao= new ProduitImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        req.getRequestDispatcher("produit/add.jsp").forward(req,resp);
       // resp.getWriter().println("ok");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String nom = req.getParameter("nom").toString();
        double qt = Double.parseDouble(req.getParameter("qteStocks").toString());

        Produit produit = new Produit();
        produit.setNom(nom);
        produit.setQteStocks(qt);
        int ok =produitdao.add(produit);
        req.setAttribute("result",ok);
        produitdao.list();
        //resp.getWriter().println(ok);
        doGet(req,resp);
    }
}
