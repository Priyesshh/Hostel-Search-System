<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        ArrayList hlist = (ArrayList)session.getAttribute("hlist");
        System.out.println("hello from display 2");
        Iterator<String> it = hlist.iterator();
        while(it.hasNext())
        {
           %>
  
           <form action ="display2.jsp">
           <input type="hidden" name="username" value="<%=it.hasNext()%>">
           <input type="submit" value = "<%=it.next()%>">
           </form>
       <%
        }
       %>
        
       
    </body>
</html>
