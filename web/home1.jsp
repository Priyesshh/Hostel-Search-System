<%-- 
    Document   : home1
    Created on : 18 Jun, 2024, 9:48:43 PM
    Author     : priye
--%>

<%@page import="org.apache.catalina.mbeans.UserMBean"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> "home "</title>
    <style>
        .option-container {
            display: block;
            align-items: center;
            margin-bottom: 20px;
        }

        .option {
            width: 200px;
            font-weight: bold;
        }

        .description {
            flex: 1;
            padding-left: 50px;
        }
        .button {
       border: 2px solid #000;
    background-color: #fff;
    color: #000;
    padding: 10px 20px;
    font-size: 16px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    cursor: pointer;
    
}
    </style>
    </head>
    <body>
         <%
         String username = (String)session.getAttribute("username");
         if(username==null)
        {
        response.sendRedirect("login.html");
        }
         PrintWriter ou = response.getWriter();
        String password = null;
        String fname = null;
        String lname = null;
        String email = null;
        String number = null;
        String address = null;
        String hostelname = null;
        String rent = null;
        String htype = null;
        String rooms = null;
        String mess = null;
        String time = null;
        String pcode = null;
        
        System.out.println("hello");
         Statement st = DBConnector.getStatement();
         ResultSet rs = null;
         String query = "Select * from hostellist where username='"+username+"'";
            
         rs = st.executeQuery(query);
         
        while(rs.next())
        {
            
           password = rs.getString(2);
           fname = rs.getString(3);
           lname = rs.getString(4);
           email = rs.getString(5);
           number = rs.getString(6);
           hostelname = rs.getString(7);
           address = rs.getString(8);
           htype = rs.getString(9);
           rent = rs.getString(10);
           rooms = rs.getString(11);
           time = rs.getString(12);
           mess = rs.getString(13);
           pcode = rs.getString(14);
        }
       session.setAttribute("fname", fname);
       session.setAttribute("lname", lname);
       session.setAttribute("email", email);
       session.setAttribute("number", number);
       session.setAttribute("hostelname", hostelname);
       session.setAttribute("address", address);
       session.setAttribute("htype", htype);
       session.setAttribute("rent", rent);
       session.setAttribute("rooms", rooms);
       session.setAttribute("time", time);
       session.setAttribute("mess", mess);
       session.setAttribute("password", password);
       session.setAttribute("pcode", pcode);
         
        %>
        
    <div class="option-container">
        
        <div class="option">Username:</div>
        <div class="description"><%=username %></div><break>
            
             <div class="option">Name:</div>
            <div class="description"><%=fname %> <%=lname%></div><break>
             <div class="option">Email:</div>
        <div class="description"><%=email %></div><break>
             <div class="option">Number:</div>
        <div class="description"><%=number %></div><break>
         <div class="option">Hostel Name:</div>
        <div class="description"><%=hostelname %></div><break>
             <div class="option">Address:</div>
        <div class="description"><%=address %></div><break>
             <div class="option">Hostel Type:</div>
        <div class="description"><%=htype %></div><break>
             <div class="option">Rent:</div>
        <div class="description"><%=rent %></div><break>
             <div class="option">Rooms:</div>
        <div class="description"><%=rooms %></div><break>
             <div class="option">Timings:</div>
        <div class="description"><%=time%></div><break>
             <div class="option">Mess:</div>
        <div class="description"><%=mess %></div><break>
            <div class="option">Pin code:</div>
        <div class="description"><%=pcode %></div><break>
            
    </div>
         <a href="edit.jsp">
        <div class ="button" action="edit.jsp">
                edit info   
        </div>
        </a>   
        <a href="logout.jsp">
        <div class ="button" action="logout.jsp">        
            logout   
        </div>
            <a href="delete.jsp">
        <div class ="button" >        
            Delete Data   
        </div>
   
   </body>
</html>
