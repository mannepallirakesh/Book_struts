package com.training;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;


public class ValidatorFormTestForm extends ValidatorForm {
	private String userName;
	private String password;

	public ValidatorFormTestForm() {
		super();
		System.out.println("LoginForm constructor called.");
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("LoginForm reset called.");

		userName = "";
		password = "";

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
