
package model;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author priye
 */
public class LoginAuthenticator 
{
  public boolean isLogin(String username,String password)
  {
      String tablepassword="";
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
