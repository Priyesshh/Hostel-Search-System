
package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginAuthenticator;

/**
 *
 * @author priye
 */
public class LoginChecker extends HttpServlet 
{


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("login.html");
    }

    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println(username+"\n"+password);
        LoginAuthenticator l1= new LoginAuthenticator();
        boolean login = l1.isLogin(username, password);
        if(login)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            
            response.sendRedirect("home1.jsp");
        }
        else
        {
            response.sendRedirect("login.html");
        }
    }    
}
