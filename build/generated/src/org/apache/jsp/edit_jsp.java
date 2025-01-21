package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>User Registration</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #ff7f7f;\n");
      out.write("            background-image: url(\"images/bg2.jpeg\") ;\n");
      out.write("            background-size: cover;\n");
      out.write("            background-repeat: no-repeat ;\n");
      out.write("        }\n");
      out.write("        .registration-form {\n");
      out.write("            max-width: 400px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            padding: 35px;\n");
      out.write("            background-color: #d9d9d9;\n");
      out.write("            background-color: #ff7f7f;\n");
      out.write("            background-image: url(\"images/bg2.jpeg\") ;\n");
      out.write("            background-size: cover;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .registration-form h1 {\n");
      out.write("            color: whitesmoke;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .registration-form label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: whitesmoke;\n");
      out.write("        }\n");
      out.write("        .registration-form input[type=\"text\"],\n");
      out.write("        .registration-form input[type=\"email\"],\n");
      out.write("        .registration-form input[type=\"password\"],\n");
      out.write("        .registration-form select {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            \n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .registration-form input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: red;\n");
      out.write("            color: #ffffff;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s ease-in-out;\n");
      out.write("        }\n");
      out.write("        .registration-form input[type=\"submit\"]:hover {\n");
      out.write("            background-color: black;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   ");

       
       String username= (String)session.getAttribute("username");
       System.out.println(username);
       String fname=      (String)session.getAttribute("fname");
       String lname=      (String)session.getAttribute("lname");
       String email=      (String)session.getAttribute("email");
       String number=     (String)session.getAttribute("number");
       String address=    (String)session.getAttribute("address");
       String hostelname= (String)session.getAttribute("hostelname");
       String htype=      (String)session.getAttribute("htype");
       String rent=       (String)session.getAttribute("rent");
       String rooms=      (String)session.getAttribute("rooms");
       String time=       (String)session.getAttribute("time");
       String mess=       (String)session.getAttribute("mess");
       String password=   (String)session.getAttribute("password");
       String pcode=      (String)session.getAttribute("pcode");
       if(username==null)
        {
        response.sendRedirect("login.html");
        }
       request.setAttribute("username", username);
   
      out.write("\n");
      out.write("    <div class=\"registration-form\">\n");
      out.write("        <h1>");
      out.print(username);
      out.write("</h1>\n");
      out.write("        <form action=\"UpdateData\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(username);
      out.write("\" name=\"username\">\n");
      out.write("             <label for=\"firstName\">First Name:</label>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"PAssword\" value = \"");
      out.print(password);
      out.write("\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"firstName\">First Name:</label>\n");
      out.write("            <input type=\"text\" id=\"firstName\" name=\"fname\" placeholder=\"First Name\" value = \"");
      out.print(fname);
      out.write("\" required>\n");
      out.write("\n");
      out.write("            <label for=\"lastName\">Last Name:</label>\n");
      out.write("            <input type=\"text\" id=\"lastName\" name=\"lname\" placeholder=\"Last Name\" value = \"");
      out.print(lname);
      out.write("\" required>\n");
      out.write("\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"email\" value = \"");
      out.print(email);
      out.write("\" required>\n");
      out.write("\n");
      out.write("            <label for=\"number\"> Mobile No.:</label>\n");
      out.write("            <input type=\"text\" id=\"number\" name=\"number\" placeholder=\"Mobile Number\" value = \"");
      out.print(number);
      out.write("\" required>\n");
      out.write("\n");
      out.write("             <label for=\"hostelname\">Name of Hostel:</label>\n");
      out.write("            <input type=\"text\" id=\"hostelname\" name=\"hostelname\" placeholder=\"Hostel Name\" value = \"");
      out.print(hostelname);
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"address\">Address:</label>\n");
      out.write("            <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Address\" value = \"");
      out.print(address);
      out.write("\">\n");
      out.write("\n");
      out.write("            <label for=\"rent\">Pin code:</label>\n");
      out.write("            <input type=\"text\" id=\"pcode\" name=\"pcode\" placeholder=\"Pin Code\" value = \"");
      out.print(pcode);
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"rooms\">No. of Rooms</label>\n");
      out.write("            <input type=\"text\" id=\"rooms\" name=\"rooms\" placeholder=\"Rooms\" value = \"");
      out.print(rooms);
      out.write("\" required >\n");
      out.write("            \n");
      out.write("             <label for=\"time\">Time:</label>\n");
      out.write("            <input type=\"text\" id=\"time\" name=\"time\" placeholder=\"Time limit\" value = \"");
      out.print(time);
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"rent\">Rent:</label>\n");
      out.write("            <input type=\"text\" id=\"rent\" name=\"rent\" placeholder=\"Rent per month\" value = \"");
      out.print(rent);
      out.write("\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <label for=\"mess\">Mess:</label>\n");
      out.write("            <select id=\"mess\" name=\"mess\" value = \"");
      out.print(mess);
      out.write("\">\n");
      out.write("                <option value=\"y\">Yes</option>\n");
      out.write("                <option value=\"n\">No</option>\n");
      out.write("            </select>\n");
      out.write("             \n");
      out.write("            <label for=\"htype\">Hostel Type:</label>\n");
      out.write("            <select id=\"htype\" name=\"htype\" value = \"");
      out.print(htype);
      out.write("\">\n");
      out.write("                <option value=\"boy\">Boys</option>\n");
      out.write("                <option value=\"girl\">Girls</option>\n");
      out.write("                <option value=\"coed\">Coed</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Update\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
