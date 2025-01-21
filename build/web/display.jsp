<%-- 
    Document   : display
    Created on : 27 Jun, 2024, 10:51:08 AM
    Author     : priye
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Display Page</title>
         <style>
        /* Dropdown Button */
        .dropbtn {
            background-color: #04AA6D;
            color: white;
            padding: 16px;
            font-size: 16px;
            border: none;
        }

        /* The container <div> - needed to position the dropdown content */
        .dropdown {
            position: relative;
            display: inline-block;
        }

        /* Dropdown Content (Hidden by Default) */
        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f1f1f1;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
            z-index: 1;
        }

        /* Links inside the dropdown */
        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }

        /* Change color of dropdown links on hover */
        .dropdown-content a:hover {
            background-color: #ddd;
        }

        /* Show the dropdown menu on hover */
        .dropdown:hover .dropdown-content {
            display: block;
        }

        /* Change the background color of the dropdown button when the dropdown content is shown */
        .dropdown:hover .dropbtn {
            background-color: #3e8e41;
        }
    </style>
    </head>
    <body>
        <%
        String pcode = (String)session.getAttribute("pcode");
         System.out.println("pcode is"+pcode);
        %>
         <div class="dropdown">
        <button class="dropbtn">Filter</button>
        <div class="dropdown-content">
           
            <form action="Filter" method = "post">
                             <input type="checkbox" id = "rent" name="rent" value="desc">  
                             <label for="rent"> Rent &darr;</label><br>
                             <input type="checkbox" id = "rent" name="rent" value="asc">  
                             <label for="rent"> Rent &uarr;</label><br>
                             <input type="checkbox" id = "htype" name="htype" value="boys">  
                             <label for="htype">Boys</label><br>
                             <input type="checkbox" id = "htype" name="htype" value="girls">  
                             <label for="htype">Girls</label><br>
                             <input type="checkbox" id = "htype" name="htype" value="coed">  
                             <label for="htype">Coed</label><br>
                             <input type="checkbox" id = "mess" name="mess" value="y">  
                             <label for="mess"> Includes Mess</label><br>
                             <input type="checkbox" id = "mess" name="mess" value="n">  
                             <label for="htype"> Excludes mess</label><br>
                             <input type="hidden" name="pcode" value="<%=pcode%>">
            +-                 <input type="submit" value="Apply">
            </form>
            
        </div>
    </div>
<br><br><br>
        <%        
        ArrayList hlist = (ArrayList)session.getAttribute("hlist");
        System.out.println("Hello from display");
        Iterator<String> it = hlist.iterator();
        while(it.hasNext())
        {
            String name = it.next();
           %>
  
           <form action ="display2.jsp">
           <input type="hidden" name="username" value="<%=name%>">
           <input type="submit" value = "<%=name%>">
           </form>
       <%
        }
       %>
    
    </body>
</html>
    