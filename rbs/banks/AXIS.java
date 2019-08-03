package com.rbs.banks;

import java.util.ArrayList;

import com.rbs.app.Application;
import com.rbs.customers.Customer;
import com.rbs.customers.Professional;
import com.rbs.customers.SeniorCitizen;
import com.rbs.customers.Student;
import com.rbs.utils.RBI;

public class AXIS extends RBI {
	Application mApplication;
	
	ArrayList<Customer> custListAxis;
	
	public AXIS() {
		this.mApplication=mApplication.getInstance();
		this.custListAxis=new ArrayList<>();
	}
	
	@Override
	public void Withdraw() {
		super.Withdraw();
	}
	@Override
	public void Deposit() {
		super.Deposit();
	}
	@Override
	public void openFD() {
		super.openFD();
	}
	@Override
	public void openAccount(int ctype) { //instanceOf is faster than ==
		Customer c;
		if(ctype==1) {
			c=new Student();
		}else if(ctype==2){
			c=new SeniorCitizen();
		}else if(ctype==3){
			c=new Professional();
		}else {
			System.out.println("Invalid Option");
			return;
		}
		c.initCustomer();
		custListAxis.add(c);
	}
}
