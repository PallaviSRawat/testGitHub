package com.rbs.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	
	ServerSocket mServerSocket;
	Socket mSocket;
	InputStreamReader mISR;
	BufferedReader mBR;
	PrintWriter mPW;
	
	public static void main(String[] args) {
		
		ServerClass mSL= new ServerClass();
		try {
			mSL.mServerSocket = new ServerSocket(8559);
			System.out.println("Server is ready now and is listening to client request....");
			mSL.mSocket=mSL.mServerSocket.accept();
			System.out.println("client accepted successfulyy and server is again free to take request.");
			mSL.mISR = new InputStreamReader(mSL.mSocket.getInputStream());
			mSL.mBR = new BufferedReader(mSL.mISR);
			mSL.mPW = new PrintWriter(mSL.mSocket.getOutputStream(),true);
			String txt=mSL.mBR.readLine();
			System.out.println("Text: "+txt);
			if (txt.toLowerCase().equals("pass")) {
				System.out.println("Incoming message from client is " + txt);
				mSL.mPW.println("Hi Client i have read ur pwd");
			}else {
				System.out.println("eww");
				mSL.mPW.println("invalid password");
			}

			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				mSL.mServerSocket.close();
				mSL.mSocket.close();
				mSL.mBR.close();
				mSL.mPW.close();
				mSL.mISR.close();
				mSL=null;
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
