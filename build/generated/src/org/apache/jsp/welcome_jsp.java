package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>AIO SHOPING</title>\n");
      out.write("           <link type=\"text/css\" rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("           <style>\n");
      out.write("               #id1{background-color:#142170 }\n");
      out.write("               </style>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"DeepSkyBlue\" >\n");
      out.write("            <center>\n");
      out.write(" \n");
      out.write("    <div id=id1 >\n");
      out.write("        <font color=\"red\" size=\"25\">WELCOME TO AIO SHOPPING </font> <br>\n");
      out.write("     <font color=\"red\" size=\"15\">AIO COMPANIES</font> <br>\n");
      out.write("    <font color=\"red\" size=\"15\">Noida,Delhi-110003 </font>\n");
      out.write("    </div>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <div id=\"section\">\n");
      out.write("            <br><br><br><br><br><br>\n");
      out.write("            <font color='navy' size='7'> Login to Shop items </font>\n");
      out.write("            <br><br><br> \n");
      out.write("            <a href=\"login.jsp\"><font size='5'>Login here</a>\n");
      out.write("   </div>  <br><br><br><br><br><br><br><br><br><br><br><br><br> <br> <br> <br>\n");
      out.write("      <div>\n");
      out.write("            <font color='navy' size='3' > Copyright © AIO.com </font>\n");
      out.write("      </div>\n");
      out.write("            </center>\n");
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
