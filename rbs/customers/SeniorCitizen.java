package com.rbs.customers;

import java.io.Serializable;

public class SeniorCitizen implements Serializable{

	private static final long serialVersionUID = -6190474163140402682L;
	
	String strSrName;
	int intSrPhoneNumber, intSrAge;
	
	public String getStrName() {
		return strSrName;
	}
	public void setStrName(String strName) {
		this.strSrName = strName;
	}
	public int getIntPhoneNumber() {
		return intSrPhoneNumber;
	}
	public void setIntPhoneNumber(int intPhoneNumber) {
		this.intSrPhoneNumber = intPhoneNumber;
	}
	public int getIntAge() {
		return intSrAge;
	}
	public void setIntAge(int intAge) {
		this.intSrAge = intAge;
	}
}
