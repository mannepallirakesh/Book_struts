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
<body bgcolor="blue" >
 	<head>
   		 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload</title>
        <style>table {	    font-family: arial, sans-serif;	    border-collapse: collapse;	    width: 100%;	}
			td, th {    border: 1px solid #dddddd;    text-align: left;    padding: 8px;}
			tr:nth-child(even) {    background-color: #dddddd;}</style>
			<table>
			<tr><th>BOOK NAME</th> <th>BOOK AUTHOR</th> <th>BOOK PRICE</th> <th>ACTION</th> </tr>
    </head>
    <body>
        <div style="color:red">
            <html:errors />
        </div>
        <div align="center" >
           <B><bean:message key="uploadForm.welcomeTitle"/></B>
        </div>
        
        
        <%
        try
               {
           Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sysadmin");
	    Statement st=con.createStatement();
		
	    String query = ("select * FROM BOOK");
	     
    	PreparedStatement pst  = con.prepareStatement(query);
		
	
		ResultSet rs = pst.executeQuery();
		
		
         
        while(rs.next())
         {
        	int bookid = rs.getInt("BOOK_ID");
         String BookName=rs.getString("BOOK_NAME");
         String AuthorName=rs.getString("AUTHOR_NAME");
         int Price = rs.getInt("PRICE");
         out.println(" <tr>"

					+ " <td>" + BookName
					+ "</td><td>" + AuthorName + "</td><td>" + Price
					+ "</td>  <td>");
         
         %>
         
<form method="POST" action="/BS/jsps/Update.jsp">
<%out.println("<input type=\"hidden\" name=\"bookid\" value="+bookid+">"); %>
<input type="submit"  value="Update">
</form> 
<form method="POST" action="/BS/jsps/Delete.jsp">
<%out.println("<input type=\"hidden\" name=\"bookid\" value="+bookid+">"); %><input type="submit"  value="Delete">
</form> 
              
         <%
         }
          
        

               }



       catch(Exception e)
               {
    	   System.out.println("Problem while executing sql");
           out.println(e);
           e.printStackTrace();
           }


       %>
       </table>
        
        
        
        
<html:form action="/UploadForm.do">
	<div align="center"><br>
	<br><br><br><br><br><br><br><br><br><br>
	
	 
		 <bean:message key="loginForm.bookname"/>: <html:text name="UploadFormBean" property="bname" /> <br> 
	 <bean:message key="loginForm.authorname"/>: <html:text name="UploadFormBean" property="aname" /> <br>
	 <bean:message key="loginForm.price"/>: <html:text name="UploadFormBean" property="price" /> <br>		
				
				<html:submit>
					 <bean:message key="loginForm.upload"/>
				</html:submit>
			
				
	</div>
</html:form>

</body>
</html>
     
   