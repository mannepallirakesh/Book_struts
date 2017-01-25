package com.training;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;


public class UploadFormTestForm extends ValidatorForm 
{    
    private String bname;
    private String aname;
    private int price;
   
    public UploadFormTestForm() 
    { super();
    	System.out.println("UploadForm constructor called.");
    }
    
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("LoginForm reset called.");

		bname = "";
		aname = "";

	}

    public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
