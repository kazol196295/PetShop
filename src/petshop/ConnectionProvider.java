/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author Kawsar Ahmed
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sami
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsop","root","amardesh"); 
            return con; 
        }
        catch(Exception e)
        {
            return null;
        }
    }
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null,"Connected");
    }
       
}