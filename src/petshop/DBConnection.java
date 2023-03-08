/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kawsar Ahmed
 */
public class DBConnection {
    private Connection myConnection;
    
    public DBConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsop?zeroDateTimeBehavior=CONVERT_TO_NULL","root","amardesh");
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    
    public Connection connectDB() {
        return myConnection;
    }
    
   
     public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void destroy(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
            }
            catch(Exception e){}
        
        
    }}
}
