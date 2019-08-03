package com.rbs.customers;

import java.io.Serializable;

public class Professional implements Serializable{

	private static final long serialVersionUID = 3143769547581815299L;
	int intEmployeeID;
	String strProfessionalName, strCompanyName;
	public int getIntEmployeeID() {
		return intEmployeeID;
	}
	public void setIntEmployeeID(int intEmployeeID) {
		this.intEmployeeID = intEmployeeID;
	}
	public String getStrProfessionalName() {
		return strProfessionalName;
	}
	public void setStrProfessionalName(String strProfessionalName) {
		this.strProfessionalName = strProfessionalName;
	}
	public String getStrCompanyName() {
		return strCompanyName;
	}
	public void setStrCompanyName(String strCompanyName) {
		this.strCompanyName = strCompanyName;
	}
}
