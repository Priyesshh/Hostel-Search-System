package model;

import db.DBConnector;
import dto.Ruserdto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author priye
 */
public class DataStore {
    
    public boolean isCheck(String username)
    {
        
      String check = ""; 
      try{
           Statement st = DBConnector.getStatement();
           String query = "Select username from hostellist where username='"+username+"'";
           ResultSet rs = st.executeQuery(query);
           System.out.println(query);
           
               if(rs.next())
               {
                   check = rs.getString(1);
                   System.out.println(check);
                   return true;
               }      
    }   catch (SQLException e) {
            System.err.println(e);
        }
     return false;
    }
    
    public boolean isRegister(Ruserdto user)
    {
        String username   = user.getUsername();
        String password   = user.getPassword();
        String fname      = user.getFname();
        String lname      = user.getLname();
        String address    = user.getAddress();
        String number     = user.getNumber();
        String mess       = user.getMess();
        String rooms      = user.getRooms();
        String time       = user.getTime();
        String htype      = user.getHtype();
        String hostelname = user.getHostelname();
        String email      = user.getEmail();
        String rent       = user.getRent();
        String pcode      = user.getPcode();
        try 
         {
            
             Statement st = DBConnector.getStatement();
             String query = "Insert into hostellist Values('"+username+"','"+password+"','"+fname+"','"+lname+"','"+email+"','"+number+"','"+hostelname+"','"+address+"','"+htype+"','"+rent+"','"+rooms+"','"+time+"','"+mess+"','"+pcode+"')";
            System.out.println(query);
             int i = st.executeUpdate(query); 
             if(i>0)
             {
                 System.out.println("Record inserted");
                 return true;
             }
         
         } 
         catch (SQLException e)
         {
             System.out.println(e);    
         }
         return false;
    
    }
}
