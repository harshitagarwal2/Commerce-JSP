package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class delete2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("                      <head>\n");
      out.write("                           <title>DataBase Records</title>\n");
      out.write("                       </head>\n");
      out.write("                      <body bgcolor='cornsilk'>\n");
      out.write("                      <center>\n");
      out.write("                          <font color='red' size='10'>RECORD REPORT</font> <br> <br>\n");
      out.write("                          <form action=\"delete3.jsp\">\n");
      out.write("                           <table border='1'>\n");
      out.write("                               <tr> <td></td> <td>ID</td> <td>NAME</td> <td>GENDER</td> <td>AGE</td> <td>ADDRESS</td> <td>MTYPE</td> <td>SALARY</td> <td>USERNAME</td> <td>PASSWORD</td> </tr>\n");
      out.write("           \n");

    String name = request.getParameter("NAME");
            String gender = request.getParameter("GENDER");
            String m = request.getParameter("MTYPE");
            int mtype = Integer.parseInt(m);
            jsp1.userdetails r = new jsp1.userdetails();

            ArrayList<jsp1.Customer> c1 = r.getreport(name, gender, mtype);
            for (jsp1.Customer c : c1) {
              out.println("<tr> <td> <input type='checkbox' name='ID' value=" + c.id + "> </td> <td>" + c.id + "</td> <td>" + c.name + "</td> <td>" + c.gender + "</td> <td>" + c.age + "</td> <td>" + c.addr + "</td> <td>" + c.mtype + "</td> <td>" + c.salary + "</td> <td>" + c.username + "</td> <td>" + c.password + "</td> </tr>");
            }
            
    
    
      out.write("\n");
      out.write("                 \n");
      out.write("                           </table> <br>\n");
      out.write("    <input type=\"submit\" value=\"delete\">\n");
      out.write("    <center><br><br><a href='report'>home</a><br><br></center>\n");
      out.write("                          </form>\n");
      out.write("                      </center>  \n");
      out.write("                   </body>\n");
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
