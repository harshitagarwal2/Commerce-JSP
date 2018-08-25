package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tikona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <div id=\"container\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div class=\"logo\"><img src=\"images/logo.png\" width=\"157\" height=\"115\" alt=\"Tikona logo\" /></div>\n");
      out.write("                <div id=\"inner-menu\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("                <div id=\"content\" style=\"margin:0\">\n");
      out.write("                    <h1>MY TIKONA <img src=\"images/home-title.png\" width=\"24\" height=\"26\" alt=\"Tikona\" /></h1><h2>Your Space. Your Way. Your Choice.</h2>\n");
      out.write("                    <p>&nbsp;</p>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                    <div class=\"content\" style=\"font-size:12px; width:420px;\">\n");
      out.write("                        <p><b>Dear Subscriber</b>,<br />\n");
      out.write("                            <br />\n");
      out.write("                            We are excited to launch our redesigned SelfCare portal - 'My Tikona' - <br />Your Space. Your Way. Your Choice. The new portal is easy to navigate and has great functionalities such as:<br />\n");
      out.write("                        </p><br />\n");
      out.write("                        <ul><li>Bill payment</li>\n");
      out.write("                            <li>In-person collection request</li>\n");
      out.write("                            <li>Session history, etc.</li></ul><br />\n");
      out.write("                        <p>Look forward to more updates.</p>\n");
      out.write("                        <p>&nbsp;</p><p>&nbsp;</p><a target=\"_blank\" href=\"http://tikona.in/for-home/customer-support/tikona-care/quick-bill-pay\"><img src=\"images/quick-bill-pay.png\" alt=\"Quick Bill Pay\" width=\"108\" height=\"21\" align=\"right\" /></a>\n");
      out.write("                        <p>Regards,<br />\n");
      out.write("                            <b>Tikona Care</b> </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sep\" style=\"width: 40px;\"><br />\n");
      out.write("                        <br />\n");
      out.write("                        <br />\n");
      out.write("                        <img src=\"images/sep.png\" width=\"20\" height=\"220\" alt=\"\"  align=\"absmiddle\"/><br />\n");
      out.write("                        <br />\n");
      out.write("                        <br />\n");
      out.write("                        <br />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"formcontent\" style=\"width: 240px;\">\n");
      out.write("                        <form class=\"myForm\" name=\"loginForm\" id=\"loginForm\" action=\"loginAction.do\" method=\"post\" onsubmit=\"return submitForm();\">\n");
      out.write("                            <label for=\"user\">\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("                                <br />\n");
      out.write("                                <span class=\"nmltxt\">User ID</span>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"username\" onkeyup=\"checkSpace(this.id)\" size=\"30\" maxlength=\"30\" autocomplete=\"off\"/>\n");
      out.write("\n");
      out.write("                            <label for=\"emailaddress\"><br />\n");
      out.write("                                <span class=\"nmltxt\">Password</span></label>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" size=\"30\" maxlength=\"30\" onkeyup=\"checkSpace(this.id)\"/>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <font style=\"font-size:12px; width:420px;color: red;\">\n");
      out.write("                                    \n");
      out.write("                                    <div class =\"errormessage\" id=\"errormessage\"></div\n");
      out.write("                                    \n");
      out.write("                                </font>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" name=\"submitbutton\" id=\"submitbutton\" value=\"\" class=\"left\"/>\n");
      out.write("                            <!--<input type=\"submit\" name=\"submitbutton\" id=\"changepwd\" value=\"\" />-->\n");
      out.write("                            <a target=\"_blank\" class=\"change_password\" href=\"https://apps.tikona.in/PasswordGenerator/\"><div style=\"margin-left:10px;\" class=\"left\" id=\"resetpwd\"></div></a>\n");
      out.write("                            <br />\n");
      out.write("                            <br />\n");
      out.write("                            <br />\n");
      out.write("                            <input type=\"hidden\" name=\"data\" id=\"data\" value=\"\"/>\n");
      out.write("                            <font style=\"font-size:12px; width:420px;color: red;\">\n");
      out.write("                                \n");
      out.write("                            </font>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            <!--<div class=\"downlink\">\n");
      out.write("                    <div class=\"downlink_container\">\n");
      out.write("                    <div class=\"downlink1\"><a target=\"_blank\" href=\"\">View Bill</a></div>\n");
      out.write("                <div class=\"downlink2\"><a target=\"_blank\" href=\"\">View Usage</a></div>\n");
      out.write("                <div class=\"downlink3\"><a target=\"_blank\" href=\"http://tikona.in/for-home/customer-support/tikona-care/refer-a-friend/\">Refer A Friend</a></div>\n");
      out.write("                <div class=\"downlink4\"><a target=\"_blank\" href=\"http://blog.tikona.in/\">Blog</a></div>\n");
      out.write("                <div class=\"downlink5\"><a target=\"_blank\" href=\"https://www.facebook.com/TikonaIndia\">Facebook</a></div>\n");
      out.write("                <div class=\"downlink6\"><a target=\"_blank\" href=\"http://forum.tikona.in/\">Tikona Forum</a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"clear\"></div>-->\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <div class=\"footer1\">\n");
      out.write("                    <div class=\"copyright\">&nbsp;Copyright © Tikona Digital Networks Pvt. Ltd.</div>\n");
      out.write("                    <div class=\"footertikona\">Tikona Care :&nbsp;&nbsp;<img src=\"images/contact-icon.png\" alt=\"Contact Tikona\" width=\"8\" height=\"16\" align=\"bottom\" /> 1860 3000 3434&nbsp;&nbsp; <img src=\"images/email-icon.png\" alt=\"Email tikona\" width=\"8\" height=\"16\" align=\"bottom\" />&nbsp;customercare@tikona.in</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer2\">&nbsp;</div>\n");
      out.write("                <div class=\"footer3\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div><!--container end-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function submitForm() {\n");
      out.write("                var username = document.getElementById(\"username\");\n");
      out.write("                var password = document.getElementById(\"password\");\n");
      out.write("\n");
      out.write("                if (username.value == \"\") {\n");
      out.write("                    document.getElementById(\"errormessage\").innerHTML = \"Invalid ID or password<br/>Please try again\";\n");
      out.write("                    username.focus();\n");
      out.write("                    document.getElementById(\"logoutBlock\").style.display = \"none\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (password.value == \"\") {\n");
      out.write("                    document.getElementById(\"errormessage\").innerHTML = \"Invalid ID or password<br/>Please try again\";\n");
      out.write("                    password.focus();\n");
      out.write("                    document.getElementById(\"logoutBlock\").style.display = \"none\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var url = \"EncryptData.do\";\n");
      out.write("\n");
      out.write("                if (typeof XMLHttpRequest != \"undefined\") {\n");
      out.write("                    req = new XMLHttpRequest();\n");
      out.write("                } else if (window.ActiveXObject) {\n");
      out.write("                    req = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                req.open(\"POST\", url, false);\n");
      out.write("\n");
      out.write("                req.onreadystatechange = processResponse;\n");
      out.write("\n");
      out.write("                req.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                req.send(\"data=\" + encodeURIComponent(username.value + \"~\" +password.value));\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function processResponse() {\n");
      out.write("                if (req.readyState == 4) {\n");
      out.write("                    if (req.status == 200) {\n");
      out.write("                        //alert(\"req.responseText \"+req.responseText);\n");
      out.write("                        var userStatus = req.responseText;\n");
      out.write("                        //document.getElementById(\"username\").value = \"\";\n");
      out.write("                        //document.getElementById(\"password\").value = \"\";\n");
      out.write("                        document.loginForm.data.value = userStatus.toString();\n");
      out.write("                        document.loginForm.submit();\n");
      out.write("                    } else {\n");
      out.write("                        //alert(\"Error Occured\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var cookies = document.cookie.split(\";\");\n");
      out.write("            for (var i = 0; i < cookies.length; i++) {\n");
      out.write("                var cookie = cookies[i];\n");
      out.write("                var eqPos = cookie.indexOf(\"=\");\n");
      out.write("                var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;\n");
      out.write("                document.cookie = name + \"=;expires=Thu, 01 Jan 1970 00:00:00 GMT\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
