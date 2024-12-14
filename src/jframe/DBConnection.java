/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;


import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author manum
 */
public class DBConnection {

     static Connection con=null;
    
    
    public synchronized static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms?useSSL=false", "root", "2023@Mallu");
               System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
      return con;
      
    
    }
    
   
}
    