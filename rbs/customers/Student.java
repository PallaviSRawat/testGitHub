package com.rbs.customers;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4228873434912649910L;
	
	String strStudentID, strStudentRollNo, strStudentName;

	public String getStrStudentID() {
		return strStudentID;
	}

	public void setStrStudentID(String strStudentID) {
		this.strStudentID = strStudentID;
	}

	public String getStrStudentRollNo() {
		return strStudentRollNo;
	}

	public void setStrStudentRollNo(String strStudentRollNo) {
		this.strStudentRollNo = strStudentRollNo;
	}

	public String getStrStudentName() {
		return strStudentName;
	}

	public void setStrStudentName(String strStudentName) {
		this.strStudentName = strStudentName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
