/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Services;

import Main.DataBase.MyConnexion;
import Main.Entité.Produit;
import Main.iServices.IProduit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaled22
 */
public class ProduitServices implements IProduit{

    @Override
    public void InsertProduit(Produit p) {
        Connection conn = MyConnexion.Get_Instance().getCon();
         
        
         String req = "INSERT INTO `produit`(`id`,`lid`,`prix`) VALUES(' "+p.getId()+"','"+p.getLid()+"','"+p.getPrix()+"')";
        System.out.println(req);
        try {
             Statement state = conn.createStatement();
             state.execute(req);
            System.out.println("add done");
            
        }catch(SQLException ex)
        {
           System.out.println("adding failed !!!!");
        }
    }

    @Override
    public void selectAll() {
  
    }

    @Override
    public void UpdateProduit(Produit p) {
        
    }

    @Override
    public void supprimerProduit(Produit p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AfficherProduit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
  
}
