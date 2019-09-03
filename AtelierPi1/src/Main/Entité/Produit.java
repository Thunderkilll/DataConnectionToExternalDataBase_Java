/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Entité;

/**
 *
 * @author khaled22
 */
public class Produit {
    
    private int id ;
    private String lid ;
    private int prix ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Produit(int id, String lid, int prix) {
        this.id = id;
        this.lid = lid;
        this.prix = prix;
    }

    public Produit() {
    }
    

    //entité

    @Override
    public String toString() {
       return id+"  "+ lid +"   "+prix+"  ";
               
    }
    
    
    
    
}
