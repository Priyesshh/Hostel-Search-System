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
import model.FilterData;
import controller.Search;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author priye
 */
public class Filter extends HttpServlet {

    @Override
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String rent = request.getParameter("rent");
     String mess = request.getParameter("mess");
     String htype = request.getParameter("htype");
     String pcode = request.getParameter("pcode");
        System.out.println("yeh filter wala pcode"+pcode);
     if(htype == null && mess== null && rent == null)
     {
       response.sendRedirect("display.jsp");
     }
     else
     {
     
        if("y".equals(mess))
         {
         FilterData f1 = new FilterData();
         ArrayList<String> hlist = f1.isMess(mess,pcode);
          if(hlist!=null)
          {
              HttpSession session = request.getSession(true);
              session.setAttribute("hlist", hlist);
              System.out.println("hello from Filter(mess)");
              response.sendRedirect("display2.jsp");
          }
         }
        else if("boys".equals(htype))
        {
        FilterData f1 = new FilterData();
         ArrayList<String> hlist = f1.isType(htype,pcode);
          if(hlist!=null)
          {
              HttpSession session = request.getSession(true);
              session.setAttribute("hlist", hlist);
              System.out.println("hello from Filter(htype)");
              response.sendRedirect("display2.jsp");
        
        }
     }
        else if("girls".equals(htype))
        {
        FilterData f1 = new FilterData();
         ArrayList<String> hlist = f1.isType(htype,pcode);
          if(hlist!=null)
          {
              HttpSession session = request.getSession(true);
              session.setAttribute("hlist", hlist);
              System.out.println("hello from Filter(girls)");
              response.sendRedirect("display2.jsp");
          }
     }
       else if("coed".equals(htype))
        {
        FilterData f1 = new FilterData();
         ArrayList<String> hlist = f1.isType(htype,pcode);
          if(hlist!=null)
          {
              HttpSession session = request.getSession(true);
              session.setAttribute("hlist", hlist);
              System.out.println("hello from Filter(coed)");
              response.sendRedirect("display2.jsp");
          }

        }
        else if("asc".equals(rent))
        {
        FilterData f1 = new FilterData();
         ArrayList<String> hlist = f1.isRent(rent,pcode);
          if(hlist!=null)
          {
              
              HttpSession session = request.getSession(true);
              session.setAttribute("hlist", hlist);
              System.out.println("hello from Filter(asc rent)");
              response.sendRedirect("display2.jsp");
          }
        }
       else if("desc".equals(rent))
        {
        FilterData f1 = new FilterData();
         ArrayList<String> hlist = f1.isRent(rent,pcode);
          if(hlist!=null)
          {
              HttpSession session = request.getSession(true);
              session.setAttribute("hlist", hlist);
              System.out.println("hello from Filter(desc rent)");
              response.sendRedirect("display2.jsp");
          }
        }
  }
 }
}