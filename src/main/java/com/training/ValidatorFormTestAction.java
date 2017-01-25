
package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;


public class ValidatorFormTestAction extends org.apache.struts.action.Action 
{
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
   
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception 
    {

    	
  //  	ValidatorFormTestForm loginForm = (ValidatorFormTestForm) form;
      
        
       String user = request.getParameter("userName");
       String passwrd = request.getParameter("password");
       
       System.out.println("Login Action user = "+ user);
       System.out.println("Login Action password = "+passwrd);
        
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sysadmin");
       Statement st=con.createStatement();
        try
        {

	
	
	String query = ("select count(USERNAME)AS CS from admin where USERNAME = ? and PASSWORD = ? ");

	PreparedStatement pst  = con.prepareStatement(query);
	
	pst.setString(1, user);
	pst.setString(2, passwrd);
	ResultSet rs = pst.executeQuery();
	con.commit();
	
	         
  
while( rs.next()){
	   
	   int cs = rs.getInt("CS");
 
 System.out.println(user);
 System.out.println("entered while");
  
 	
  
  if(cs == 1)
      {
                 System.out.println("Success"); 
                 
                 
                
                 
                 
                 
                 return mapping.findForward(SUCCESS);
 }
 
 else
 {
	 System.out.println("fail");
	 return mapping.findForward(FAILURE);

 }

  }
 
    }




catch(Exception e)
        {
	   System.out.println("Problem while executing sql");
    
    e.printStackTrace();
    }
		return null;

        
    }
}
