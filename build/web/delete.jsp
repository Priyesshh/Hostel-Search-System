<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%
        String username = (String) session.getAttribute("username");
        if(username==null)
        response.sendRedirect("login.html");
        
        
        %>
        <h1>Hello <%= username%></h1>
        <form action="DeleteData" method="post">
            <input type="hidden" value="<%=username%>" name="username">
            <input type='password' name='password' id="password" placeholder="confirm your password" required>
            <input type="submit" value='Delete'>
        </form>
    </body>
</html>
