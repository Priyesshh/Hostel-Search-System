package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Display Page</title>\n");
      out.write("         <style>\n");
      out.write("        /* Dropdown Button */\n");
      out.write("        .dropbtn {\n");
      out.write("            background-color: #04AA6D;\n");
      out.write("            color: white;\n");
      out.write("            padding: 16px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* The container <div> - needed to position the dropdown content */\n");
      out.write("        .dropdown {\n");
      out.write("            position: relative;\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Dropdown Content (Hidden by Default) */\n");
      out.write("        .dropdown-content {\n");
      out.write("            display: none;\n");
      out.write("            position: absolute;\n");
      out.write("            background-color: #f1f1f1;\n");
      out.write("            min-width: 160px;\n");
      out.write("            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);\n");
      out.write("            z-index: 1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Links inside the dropdown */\n");
      out.write("        .dropdown-content a {\n");
      out.write("            color: black;\n");
      out.write("            padding: 12px 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Change color of dropdown links on hover */\n");
      out.write("        .dropdown-content a:hover {\n");
      out.write("            background-color: #ddd;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Show the dropdown menu on hover */\n");
      out.write("        .dropdown:hover .dropdown-content {\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Change the background color of the dropdown button when the dropdown content is shown */\n");
      out.write("        .dropdown:hover .dropbtn {\n");
      out.write("            background-color: #3e8e41;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"dropdown\">\n");
      out.write("        <button class=\"dropbtn\">Filter</button>\n");
      out.write("        <div class=\"dropdown-content\">\n");
      out.write("           \n");
      out.write("            <form action=\"Filter\">\n");
      out.write("                             <input type=\"checkbox\" id = \"rent\" name=\"rent\" value=\"desc\">  \n");
      out.write("                             <label for=\"rent\"> Rent &darr;</label><br>\n");
      out.write("                             <input type=\"checkbox\" id = \"rent\" name=\"rent\" value=\"asc\">  \n");
      out.write("                             <label for=\"rent\"> Rent &uarr;</label><br>\n");
      out.write("                             <input type=\"checkbox\" id = \"htype\" name=\"htype\" value=\"boys\">  \n");
      out.write("                             <label for=\"htype\">Boys</label><br>\n");
      out.write("                             <input type=\"checkbox\" id = \"htype\" name=\"htype\" value=\"girls\">  \n");
      out.write("                             <label for=\"htype\">Girls</label><br>\n");
      out.write("                             <input type=\"checkbox\" id = \"htype\" name=\"htype\" value=\"coed\">  \n");
      out.write("                             <label for=\"htype\">Coed</label><br>\n");
      out.write("                             <input type=\"checkbox\" id = \"mess\" name=\"mess\" value=\"y\">  \n");
      out.write("                             <label for=\"mess\"> Includes Mess</label><br>\n");
      out.write("                             <input type=\"checkbox\" id = \"mess\" name=\"mess\" value=\"n\">  \n");
      out.write("                             <label for=\"htype\"> Excludes mess</label><br>\n");
      out.write("                             <input type=\"submit\" value=\"Apply\">\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<br><br><br>\n");
      out.write("        ");
        
        ArrayList hlist = (ArrayList)session.getAttribute("hlist");
        System.out.println("Hello from display");
        Iterator<String> it = hlist.iterator();
        
        while(it.hasNext())
        {
           
      out.write("\n");
      out.write("  \n");
      out.write("           <form action =\"display2.jsp\">\n");
      out.write("           <input type=\"hidden\" name=\"username\" value=\"");
      out.print(it.hasNext());
      out.write("\">\n");
      out.write("           <input type=\"submit\" value = \"");
      out.print(it.next());
      out.write("\">\n");
      out.write("           </form>\n");
      out.write("       ");

        }
       
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
