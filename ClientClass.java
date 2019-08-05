package com.rbs.networking;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class ClientClass {
	Socket mSocket;
	InputStreamReader mISR;
	BufferedReader mBR;
	PrintWriter mPW;
	
	public static void main(String[] args) {
		ClientClass mCL =new ClientClass();
		try {
			mCL.mSocket =new Socket("127.0.0.1",8559);
			//2start
			mCL.mISR=new InputStreamReader(System.in);
			//2end
//			mCL.mISR = new InputStreamReader(mCL.mSocket.getInputStream());
			mCL.mBR = new BufferedReader(mCL.mISR);
			mCL.mPW = new PrintWriter(mCL.mSocket.getOutputStream(), true);
			//2start
			String line=null;
			FileOutputStream mFileOutputStream =new FileOutputStream("testfile1.ser");
//			while ((line = mCL.mBR.readLine()) != null) {
                
				line=mCL.mBR.readLine();
				  System.out.println(line);
	             byte b[]=line.getBytes();//converting string into byte array    
	             mFileOutputStream.write(b);  
//			}
			
			FileInputStream mFileInputStream =new FileInputStream("testfile1.ser");
			int i=0;    
			String s="";
            while((i=mFileInputStream.read())!=-1){    
            	s=s+(char)i;

            }
        	System.out.println(s);
        	mCL.mPW.println(s);
        	System.out.println(":(");
        	BufferedReader br=new BufferedReader(new InputStreamReader(mCL.mSocket.getInputStream()));
        	String ss=br.readLine();
			System.out.println("Reading Data from Server "+ ss);
			//2end
            
//			mCL.mPW.println("Sending my Details to Server ");
            
            mFileInputStream.close();
            mFileOutputStream.close();
			
		}
		catch(UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				mCL.mSocket.close();
				mCL.mISR.close();
				mCL.mBR.close();
				
				
				mCL.mPW.close();
				mCL=null;
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
