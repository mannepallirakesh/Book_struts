
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


public class UploadFormTestAction extends org.apache.struts.action.Action 
{
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
   
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception 
    {

//   	UploadForm uploadForm = (UploadForm) form;
        
        
        String bname = request.getParameter("bname");
        String aname = request.getParameter("aname");
        int price = Integer.parseInt(request.getParameter("price"));
        System.out.println("Action = "+bname);
        System.out.println("Acton ="+aname);
        System.out.println("Action = "+price);
        
       try
       {
   Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sysadmin");
Statement st=con.createStatement();
 
ResultSet rs=st.executeQuery("SELECT MAX(BOOK_ID) AS MAX_ID FROM BOOK");
 
rs.next();

int max= rs.getInt("MAX_ID");
System.out.println("test");
System.out.println(max);
	
String query = "INSERT INTO BOOK(BOOK_ID, BOOK_NAME, AUTHOR_NAME, PRICE) VALUES(?, ?, ?, ?)";

	PreparedStatement pst  = con.prepareStatement(query);

	pst.setInt(1, max+1);
	pst.setString(2, bname);
	pst.setString(3, aname);
	pst.setInt(4, price);
	pst.executeUpdate();
	System.out.println("done");
	con.commit();
	
	 
	 
   }




catch(Exception e)
       {
	   System.out.println("Problem while executing sql");
   
   e.printStackTrace();
   }
		
       return mapping.findForward(SUCCESS);  
       
   }
}
