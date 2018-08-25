package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>MENU</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor='Antiquewhite' >\n");
      out.write("         <Center>\n");
      out.write("    <h1><font color=\"Red\" Size=\"13\">Menu</font></h1>\n");
      out.write("       <font  color='navy' size='6' >To register a new Account</font>\n");
      out.write("        <a href=\"registration.jsp\">click here</a>   <br><br>\n");
      out.write("        <Font color=\"navy\" size=\"6\" > To view records from database</font>\n");
      out.write("        <a href=\"report.jsp\">click here</a> <br><br>\n");
      out.write("        <Font color=\"navy\" size=\"6\" > To delete records from database</font>\n");
      out.write("        <a href=\"delete.jsp\">click here</a> <br><br>\n");
      out.write("         <Font color=\"navy\" size=\"6\" > To logout</font>\n");
      out.write("         <a href=\"logoff.jsp\" >click here </a> <br><br>\n");
      out.write("                  <Font color=\"navy\" size=\"6\" > To Update Records from Databse  </font>\n");
      out.write("         <a href=\"update.jsp\" >click here </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
