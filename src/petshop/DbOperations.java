/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;


//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel; 
//import  net.proteanit.sql.DbUtils;
//
//
//import javax.swing.JOptionPane;
//import java.sql.*; 
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import com.mysql.cj.xdevapi.Statement;
////import dao.DbOperations;
////import dao.UserDao;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import javax.swing.JOptionPane;
//import model.User;
//import java.sql.*;
//import java.sql.Connection;
////import java.sql.Statement;
//import javax.swing.JOptionPane;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Kawsar Ahmed
 */
public class DbOperations {
    public static void setDataOrDelete(String Query,String msg)
    {
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = (Statement) con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
            {
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query)
      {
         try
         {
             Connection con = ConnectionProvider.getCon();
             Statement st = con.createStatement();
             ResultSet rs =st.executeQuery(query);
             return rs; 
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
             return null;
         }

      }
}
