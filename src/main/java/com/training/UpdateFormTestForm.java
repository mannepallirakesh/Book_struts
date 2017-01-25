package com.training;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;


public class UpdateFormTestForm extends ValidatorForm 
{    
    private int bkid;
    
    public int getBkid() {
    	System.out.print(bkid);
		return bkid;
		
	}


	public void setBkid(int bkid) {
		this.bkid = bkid;
		System.out.print(bkid);
	}
	private String bname;
    private String aname;
    private int price;
   
    public UpdateFormTestForm() 
    { super();
    	System.out.println("UploadForm constructor called.");
    }
    
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("LoginForm reset called.");

		bname = "";
		aname = "";

	}

    public String getBname() {
    	System.out.print(bname);
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
		System.out.print(bname);
	}
	public String getAname() {
		System.out.print(aname);
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
		System.out.print(aname);
	}
	public int getPrice() {
		System.out.print(price);
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		System.out.print(price);
	}

}
