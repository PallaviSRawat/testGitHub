package com.rbs.spcore;

public class Branch {
	String branchName, years;

	public Branch(String branchName, String years) {
		super();
		this.branchName = branchName;
		this.years = years;
	}

	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", years=" + years + "]";
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}
	
}
