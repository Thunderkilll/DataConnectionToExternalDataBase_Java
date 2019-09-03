/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.DataBase.MyConnexion;
import Main.Entité.Produit;
import Main.Services.ProduitServices;
import java.sql.Connection;

/**
 *
 * @author khaled22
 */
public class AtelierPi1 {
   
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //TODO code application logic here
        Produit p = new Produit(12, "khaled1.0", 12);
        MyConnexion.Get_Instance();
        MyConnexion.Get_Instance().getCon();
       // InsertProduit(p);
        
        
    }
    
}
