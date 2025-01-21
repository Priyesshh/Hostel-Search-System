package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author priye
 */
public class UpdateData extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("login.html");
    }

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");    
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        String number = request.getParameter("number");
        String mess = request.getParameter("mess");
        String rooms = request.getParameter("rooms");
        String time = request.getParameter("time");
        String htype = request.getParameter("htype");
        String hostelname = request.getParameter("hostelname");
        String email = request.getParameter("email");
        String rent = request.getParameter("rent");
        String pcode = request.getParameter("pcode");
        try {
           Statement st = DBConnector.getStatement();
           String query = "update hostellist set fname='"+fname+"',lname='"+lname+"',email='"+email+"',number='"+number+"',hostelname='"+hostelname+"',address='"+address+"',htype='"+htype+"',rent='"+rent+"',rooms='"+rooms+"',time='"+time+"',mess='"+mess+"' where username='"+username+"' pcode='"+pcode+"'";
           int i = st.executeUpdate(query);
                
                System.out.println(i);
                System.out.println(query);
            response.sendRedirect("home1.jsp");
            }
            
           catch (SQLException e){
               System.out.println(e);
       }

}
}
