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
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignUp</title>

</head>

<body>


<html:form action="/UpdateForm.do">
<div align="center"><br>
<br><br><br><br><br><br><br><br><br><br>

<% int bkid = Integer.parseInt(request.getParameter("bookid"));
String bkn = request.getParameter("BookName");
System.out.println(bkid);
out.println("<input type=\"hidden\" name=\"bookid\" value="+bkid+">"); %>
<bean:message key="loginForm.bookname" />: <html:text   name="UpdateFormBean" property="bname" /> <br> 
<bean:message key="loginForm.authorname"/>: <html:text  name="UpdateFormBean" property="aname" /> <br>
<bean:message key="loginForm.price"/>: <html:text  name="UpdateFormBean" property="price" /> <br>		
		
		<html:submit>
			 <bean:message key="loginForm.update"/>
		</html:submit>
	
		
</div>
</html:form>

</body>
</html>
