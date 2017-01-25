 <%@ page import="java.io.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.IOException"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="javax.servlet.ServletException"%>
<%@ page import="javax.servlet.http.HttpServlet"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import = "java.sql.*" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML >

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete</title>

</head>

<body>

<%

   

    int bkid = Integer.parseInt(request.getParameter("bookid"));
System.out.println(bkid);

    
    
    
    try
    {
    	
	    	
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sysadmin");

Statement st=con.createStatement();
System.out.println("connection");

PreparedStatement pst = con.prepareStatement("DELETE BOOK WHERE BOOK_ID = ?");

pst.setInt(1, bkid);
ResultSet rs = pst.executeQuery();



rs.next();
con.commit();
%>
<jsp:forward page="Success.jsp"/>
<%
out.println("Your Book is Deleted");

out.println();
out.println("<BR>");
out.println("</BR>");
out.println();
out.println();
out.println("<BR>");

out.println("</BR>");
	    

    }

catch(Exception e)
    {

}

    %>
    
    
	



</body>
</html>
