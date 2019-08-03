package com.rbs.utils;

public class RBI implements Operations{
	
	public final int MIN_AMOUNT=1000;
	public final int WITHDRAW_COUNT=0;
	public int DEPOSIT_COUNT=0;
	private final int MIN_FD_AMOUNT=5000;
	private int FD_AMOUNT_YEARS =3;
	private int FD_AMOUNT_1_YEAR_INTEREST = 6;
	private int FD_AMOUNT_2_YEAR_INTEREST=7;
	private int FD_AMOUNT_3_YEAR_INTEREST=8;
	
	public int getDEPOSIT_COUNT() {
		return DEPOSIT_COUNT;
	}
	public void setDEPOSIT_COUNT(int dEPOSIT_COUNT) {
		DEPOSIT_COUNT = dEPOSIT_COUNT;
	}
	public int getFD_AMOUNT_YEARS() {
		return FD_AMOUNT_YEARS;
	}
	public void setFD_AMOUNT_YEARS(int fD_AMOUNT_YEARS) {
		FD_AMOUNT_YEARS = fD_AMOUNT_YEARS;
	}
	public int getFD_AMOUNT_1_YEAR_INTEREST() {
		return FD_AMOUNT_1_YEAR_INTEREST;
	}
	public void setFD_AMOUNT_1_YEAR_INTEREST(int fD_AMOUNT_1_YEAR_INTEREST) {
		FD_AMOUNT_1_YEAR_INTEREST = fD_AMOUNT_1_YEAR_INTEREST;
	}
	public int getFD_AMOUNT_2_YEAR_INTEREST() {
		return FD_AMOUNT_2_YEAR_INTEREST;
	}
	public void setFD_AMOUNT_2_YEAR_INTEREST(int fD_AMOUNT_2_YEAR_INTEREST) {
		FD_AMOUNT_2_YEAR_INTEREST = fD_AMOUNT_2_YEAR_INTEREST;
	}
	public int getFD_AMOUNT_3_YEAR_INTEREST() {
		return FD_AMOUNT_3_YEAR_INTEREST;
	}
	public void setFD_AMOUNT_3_YEAR_INTEREST(int fD_AMOUNT_3_YEAR_INTEREST) {
		FD_AMOUNT_3_YEAR_INTEREST = fD_AMOUNT_3_YEAR_INTEREST;
	}
	public int getMIN_AMOUNT() {
		return MIN_AMOUNT;
	}
	public int getWITHDRAW_COUNT() {
		return WITHDRAW_COUNT;
	}
	public int getMIN_FD_AMOUNT() {
		return MIN_FD_AMOUNT;
	}
	@Override
	public void openAccount() {	
	}
	@Override
	public void Deposit() {	
	}
	@Override
	public void Withdraw() {	
	}
	@Override
	public void openFD() {
	}
}
