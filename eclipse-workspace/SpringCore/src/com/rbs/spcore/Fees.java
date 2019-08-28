package com.rbs.spcore;

public class Fees {

	 String strTutionFees, strDevelopmentFees, strTotalFees;

	public Fees(String strTutionFees, String strDevelopmentFees, String strTotalFees) {
		super();
		this.strTutionFees = strTutionFees;
		this.strDevelopmentFees = strDevelopmentFees;
		this.strTotalFees = strTotalFees;
	}


	@Override
	public String toString() {
		return "Fees [strTutionFees=" + strTutionFees + ", strDevelopmentFees=" + strDevelopmentFees + ", strTotalFees="
				+ strTotalFees + "]";
	}
	
	 
}
