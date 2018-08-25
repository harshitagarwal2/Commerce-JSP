<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%
      try {
            int k=0;
            response.setContentType("text/html");
            String id[] = request.getParameterValues("ID");
            System.out.println("========================" + id);
            Connection c = jsp1.moc.goc();
            Statement s =c.createStatement();
          for (String a : id) {
                k= Integer.parseInt(a);
            String sql="delete cust_mast where id =" + k ;
            s.executeQuery(sql);
            }
            response.sendRedirect("menu.jsp");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            
      %>