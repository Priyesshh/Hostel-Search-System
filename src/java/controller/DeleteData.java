/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DeleteAuthenticator;

/**
 *
 * @author priye
 */
public class DeleteData extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
{
response.sendRedirect("login.jsp");
}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           
    String username = request.getParameter("username");
    String password = request.getParameter("password");
        System.out.println(username);
        DeleteAuthenticator d1 = new DeleteAuthenticator();
        boolean del = d1.isDelete(username, password);
        if(del){
        try{
    Statement st = DBConnector.getStatement();
    String query= "delete from hostellist where username='"+username+"'";
    int i = st.executeUpdate(query);
    } catch (SQLException e) {
        System.out.println(e);
    }
    response.sendRedirect("home.html");
    }
        else
        {
            response.sendRedirect("delete.jsp");
        }
    }
}
