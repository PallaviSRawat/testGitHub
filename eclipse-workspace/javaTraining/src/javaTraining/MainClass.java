package javaTraining;

import java.util.Scanner;

class InputClass{
	private Scanner sc;
	
	InputClass(){
		sc=new Scanner(System.in);
	}
	
	private int readInt(){
		int i=sc.nextInt();
		return i;
	}
}
public class MainClass {
	
	int[] option ;
	String[] banksList;
	int menuItem;
	int nosOfBanks;
	int nosOfUserTypes;
	String[] userTypes;
	Scanner objInput;
	MainClass(){
		//expecting that it is reading it from a configuration file
		objInput=new Scanner(System.in);
		nosOfUserTypes=3;
		nosOfBanks=4;
		option =new int[2];
		banksList[0]="ICICI";
		banksList[1]="RBS";
		banksList[2]="AXIS";
		banksList[3]="HDFC";
		
		userTypes[0]="student";
		userTypes[1]="professional";
		userTypes[2]="Senior citizen";
		
//		banksList= ;
	}
	private void MenuItem(){
		if(menuItem==1) {
			System.out.println("Select your Bank");
			for(int i=0;i<this.nosOfBanks;i++) {
				System.out.println(this.banksList[i]);
			}
		}else if(menuItem==2) {
			System.out.println("Select user type");
			for(int i=0;i<this.nosOfUserTypes;i++) {
				System.out.println(this.userTypes[i]);
			}
		}else {
			
			System.out.println("Exit");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass objMainClass= new MainClass();
		

	}

}
