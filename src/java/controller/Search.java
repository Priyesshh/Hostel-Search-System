    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.SearchHostels;
import sun.security.krb5.internal.rcache.AuthList;

/**
 *
 * @author priye
 */
public class Search extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        String pcode = request.getParameter("pcode");
        
        SearchHostels s1 = new SearchHostels();
        ArrayList hlist = s1.isSearch(pcode);
            
        
        if(hlist!=null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("hlist", hlist);
            session.setAttribute("pcode", pcode);
            System.out.println("hello from Search"+pcode+"search wala");
        response.sendRedirect("display.jsp");
        }
        else
        {
        response.sendRedirect("home.jsp");
        }
    }

    
  
    
}
