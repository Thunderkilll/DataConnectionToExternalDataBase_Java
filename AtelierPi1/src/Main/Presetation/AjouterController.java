/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Presetation;

import Main.Entité.Produit;
import Main.Services.ProduitServices;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author khaled22
 */
public class AjouterController implements Initializable {
    @FXML
    private TextField libel;
    @FXML
    private TextField prix;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
   
    }    
       @FXML
      private void ajouter (ActionEvent event){
        
        Produit p = new Produit();
        p.setLid(libel.getText());
        p.setPrix(Integer.parseInt(prix.getText()));
        ProduitServices ps = new ProduitServices();
        ps.InsertProduit(p);
    }
}
