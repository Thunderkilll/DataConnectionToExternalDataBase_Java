/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author khaled22
 */
public class MyConnexion {
    
    private String url="jdbc:mysql://localhost:3306/stock";
    private String login="root";
    private String passwd="" ;
    private Connection conn ;
    private static MyConnexion instance = null ;
     
    private MyConnexion () {
        try {
            conn =  DriverManager.getConnection(url, login, passwd);
            
             System.out.println("conexion done !");
        } catch (SQLException ex) {
            System.out.println("conexion failed ??!!");
        }
        
    }
    
   public static MyConnexion Get_Instance () {
       if (instance == null){
           instance = new  MyConnexion();
       }
        return instance ;
       
       
   }
   public Connection getCon() {
       
       return conn ;
   }
    
}
