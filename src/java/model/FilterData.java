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
public class FilterData {
    
    
    Statement st = DBConnector.getStatement();
    ResultSet rs = null;
    
    
    public ArrayList<String> isMess(String mess, String pcode)
    {
        ArrayList<String> hlist = new ArrayList();
        System.out.println(pcode);
    if("y".equals(mess))
    {
   try
   { String query = "Select username from hostellist where mess='"+mess+"' and pcode = '"+pcode+"'";
    rs = st.executeQuery(query);
    while(rs.next())
        {
            
            hlist.add(rs.getString(1));
            System.out.println("hello from FilterData");
//            System.out.println(rs.getString(1));
        }
   }
   catch(SQLException e)
           {
               System.out.println(e);
           }
    }
        
     return hlist; 
    }
    
    
    public ArrayList<String> isRent(String rent, String pcode)
    {
      ArrayList<String> hlist = new ArrayList();
        
      if("asc".equals(rent))
      {  try{
          String query="Select username from hostellist order by rent desc and pcode = '"+pcode+"'";
          rs = st.executeQuery(query);
          while(rs.next())
          {
            hlist.add(rs.getString(1));
            System.out.println("hello from is mess method");
          }
      }  
      catch(SQLException e)
      {
      
          System.out.println(e);
      }
      }  
      else 
      {  try{
          String query="Select username from hostellist order by rent Asc and pcode = '"+pcode+"'";
          rs = st.executeQuery(query);
          while(rs.next())
          {
            hlist.add(rs.getString(1));
            System.out.println("hello from is rent method");
          }
      }  
      catch(SQLException e)
      {
          System.out.println(e);
      }
      }
      return hlist;
    }
    
    public ArrayList<String> isType(String htype, String pcode)
    {
      ArrayList<String> hlist = new ArrayList();
        System.out.println(pcode);
      if("boys".equals(htype))
      {  try{
          String query="Select username from hostellist where htype = 'boys' and pcode = '"+pcode+"'";
          rs = st.executeQuery(query);
          while(rs.next())
          {
            hlist.add(rs.getString(1));
            System.out.println("hello from istype boys method");
          }
      }  
      catch(SQLException e)
      {
      
          System.out.println(e);
      }
      }
      else if("girls".equals(htype))
      {  try{
          String query="Select username from hostellist where htype = 'girls' and pcode = '"+pcode+"'";
          rs = st.executeQuery(query);
          while(rs.next())
          {
            hlist.add(rs.getString(1));
            System.out.println("hello from is htype method(girls) method");
          }
      }  
      catch(SQLException e)
      {
      
          System.out.println(e);
      }
      }
      else 
      {  try{
          String query="Select username from hostellist where htype = 'coed' and pcode = '"+pcode+"'";
          rs = st.executeQuery(query);
          while(rs.next())
          {
            hlist.add(rs.getString(1));
            System.out.println("hello from istype coed method");
          }
      }  
      catch(SQLException e)
      {
          System.out.println(e);
      }
      }
      
      
      return hlist;
    }
    
}
