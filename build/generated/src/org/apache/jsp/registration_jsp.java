package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>New Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor='Antiquewhite'>\n");
      out.write("    <center>\n");
      out.write("        <font color=\"blue\" size=\"5\">Welcome to New Registration Form</font> <br>\n");
      out.write("        <font color=\"red\" size=\"4\"> Please Enter your details</font> <br>\n");
      out.write("        <hr>\n");
      out.write("        <form action=\"reg.jsp\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr> <td>Name</td>          <td> <input type=\"text\" name=\"NAME\"> </td> </tr>\n");
      out.write("            <tr> <td>Address</td>       <td> <textarea rows=\"4\" cols=\"50\" name=\"ADDRESS\"> </textarea> </td></tr>\n");
      out.write("            <tr> <td>Gender</td>        <td> <input type=\"radio\" name=\"GENDER\" value=\"M\"> Male <br>\n");
      out.write("                                             <input type=\"radio\" name=\"GENDER\" value=\"F\"> Female <br></td></tr>\n");
      out.write("            <tr> <td>Membership</td>    <td> <select name=\"MTYPE\"> \n");
      out.write("                                             <option> Select </option>\n");
      out.write("                                             <option value=\"1\"> Platinum </option>\n");
      out.write("                                             <option value=\"2\"> Gold </option>\n");
      out.write("                                             <option value=\"3\"> Silver </option> </select> </td></tr> \n");
      out.write("            <tr> <td>Age</td>               <td> <input type=\"number\" name=\"AGE\" > </td></tr>\n");
      out.write("           \n");
      out.write("            <tr> <td>salary</td>               <td> <input type=\"number\" name=\"SALARY\" > </td></tr>\n");
      out.write("            <tr> <td>Username</td>      <td> <input type=\"text\" name=\"USERNAME\"> </td></tr>\n");
      out.write("            <tr> <td>Password</td>      <td> <input type=\"password\" name=\"PASSWORD\"></td></tr>\n");
      out.write("  <tr> <td></td>      <td> <input type='submit' name='SUBMIT' value='save' > </td></tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("\n");
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
