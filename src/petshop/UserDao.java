/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import model.User;

/**
 *
 * @author Kawsar Ahmed
 */
public class UserDao {
    public static User login(String name,String password)
    {
        User user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from usertbl where Uname='"+name+"'and Upass='"+password+"'");
            while(rs.next())
            {
               // user = new User();
                user = new User();
                //user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        return user; 
    }
    public static User login(String password)
    {
        String name ="Admin";
        User user = null;
        try
        {
            ResultSet rs = DbOperations.getData("select *from usertbl where Uname='"+name+"'and Upass='"+password+"'");
            while(rs.next())
            {
               // user = new User();
                user = new User();
                //user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        return user; 
    }
    
    
}
