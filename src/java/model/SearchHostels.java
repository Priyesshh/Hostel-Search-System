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
import java.util.ArrayList;

/**
 *
 * @author priye
 */
public class SearchHostels
{

    public ArrayList isSearch(String pcode)
    {
      ArrayList hlist = new ArrayList();
      
try
{
    Statement st = DBConnector.getStatement();
    ResultSet rs = null;
   
    String query = "Select username from hostellist where pcode='"+pcode+"'";
        rs = st.executeQuery(query);
        while(rs.next())
        {
            
            hlist.add(rs.getString(1));
            System.out.println("hello from searchostel");
//            System.out.println(rs.getString(1));
        }
        
        
} 
catch(SQLException e)
{
    System.out.println(e);
}
        
      return hlist;  
    }
}