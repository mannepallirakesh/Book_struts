
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html>
<body bgcolor="#CCFF66" >
 	<head>
   		 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div style="color:red">
            <html:errors />
        </div>
        <div align="center" >
           <B><bean:message key="loginForm.welcomeTitle"/></B>
        </div>
<html:form action="/ValidatorForm.do">
	<div align="center"><br>
	<br><br><br><br><br><br><br><br><br><br>
	
	 <bean:message key="loginForm.username"/>: <html:text  name="ValidatorFormBean" property="userName" /> <br>&nbsp
	 <bean:message key="loginForm.password"/>: <html:password name="ValidatorFormBean" property="password" /> <br>
				<html:submit>
					 <bean:message key="loginForm.login"/>
				</html:submit>
			
				
	</div>
</html:form>

</body>
</html>

