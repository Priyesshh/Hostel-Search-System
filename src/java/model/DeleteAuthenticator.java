/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author priye
 */
public class DeleteAuthenticator 
{
    public boolean isDelete(String username,String password)
    {
    String tablepassword = null;
     try
  {
     Statement st = DBConnector.getStatement();
     String query ="Select password from hostellist where username='"+username+"'";
      ResultSet rs = st.executeQuery(query);
            System.out.println(query);

      if(rs.next())
      {
          tablepassword = rs.getString(1);  
          System.out.println(username);
      }
      else
      {
      return false;
      }
  }
  catch(SQLException e)
  {
      System.out.println(e);
  
  }
      if(!username.trim().equals("") && password.equalsIgnoreCase(tablepassword)) 
  {
  return true;
  }
  return false;
      }
    }
    

