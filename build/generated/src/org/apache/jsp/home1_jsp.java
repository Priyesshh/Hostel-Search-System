package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.mbeans.UserMBean;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnector;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title> \"home \"</title>\n");
      out.write("    <style>\n");
      out.write("        .option-container {\n");
      out.write("            display: block;\n");
      out.write("            align-items: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .option {\n");
      out.write("            width: 200px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .description {\n");
      out.write("            flex: 1;\n");
      out.write("            padding-left: 50px;\n");
      out.write("        }\n");
      out.write("        .button {\n");
      out.write("       border: 2px solid #000;\n");
      out.write("    background-color: #fff;\n");
      out.write("    color: #000;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

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
         
        
      out.write("\n");
      out.write("        \n");
      out.write("    <div class=\"option-container\">\n");
      out.write("        \n");
      out.write("        <div class=\"option\">Username:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(username );
      out.write("</div><break>\n");
      out.write("            \n");
      out.write("             <div class=\"option\">Name:</div>\n");
      out.write("            <div class=\"description\">");
      out.print(fname );
      out.write(' ');
      out.print(lname);
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Email:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(email );
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Number:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(number );
      out.write("</div><break>\n");
      out.write("         <div class=\"option\">Hostel Name:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(hostelname );
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Address:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(address );
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Hostel Type:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(htype );
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Rent:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(rent );
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Rooms:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(rooms );
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Timings:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(time);
      out.write("</div><break>\n");
      out.write("             <div class=\"option\">Mess:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(mess );
      out.write("</div><break>\n");
      out.write("            <div class=\"option\">Pin code:</div>\n");
      out.write("        <div class=\"description\">");
      out.print(pcode );
      out.write("</div><break>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("         <a href=\"edit.jsp\">\n");
      out.write("        <div class =\"button\" action=\"edit.jsp\">\n");
      out.write("                edit info   \n");
      out.write("        </div>\n");
      out.write("        </a>   \n");
      out.write("        <a href=\"logout.jsp\">\n");
      out.write("        <div class =\"button\" action=\"logout.jsp\">        \n");
      out.write("            logout   \n");
      out.write("        </div>\n");
      out.write("            <a href=\"delete.jsp\">\n");
      out.write("        <div class =\"button\" >        \n");
      out.write("            Delete Data   \n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("   </body>\n");
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
