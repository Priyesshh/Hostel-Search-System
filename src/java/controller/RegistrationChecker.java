package controller;

import db.DBConnector;
import dto.Ruserdto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.DataStore;


/**
 *
 * @author priye
 */

public class RegistrationChecker extends HttpServlet {
   
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("register.html");
    
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
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
        String pcode= request.getParameter("pcode");
        String image = request.getParameter("image");
        
        System.out.println(image);
        
        Ruserdto user = new Ruserdto();
        user.setFname(fname);
        user.setAddress(address);
        user.setEmail(email);
        user.setHostelname(hostelname);
        user.setHtype(htype);
        user.setLname(lname);
        user.setMess(mess);
        user.setNumber(number);
        user.setUsername(username);
        user.setTime(time);
        user.setRooms(rooms);
        user.setPassword(password);
        user.setRent(rent);
        user.setPcode(pcode);
        user.setImage();
        DataStore d1 = new DataStore();
        System.out.println("hello");
        boolean checker = d1.isCheck(username);
        if(checker)
        {
            System.out.println("hello1");
         response.sendRedirect("register.html");
        }
        else
        {
        boolean register = d1.isRegister(user);
         if(register)
           {
            System.out.println("hello2");
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            response.sendRedirect("home.html");
           }
    }
    }
}
     
       



