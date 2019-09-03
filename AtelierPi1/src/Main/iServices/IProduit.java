/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.iServices;

import Main.Entité.Produit;

/**
 *
 * @author khaled22
 */
public interface IProduit {
    public void InsertProduit (Produit p);
    public void selectAll();
    public void UpdateProduit (Produit p);
    public void supprimerProduit (Produit p);
    public void AfficherProduit();
}
