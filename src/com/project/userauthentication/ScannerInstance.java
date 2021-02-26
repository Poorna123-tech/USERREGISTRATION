package com.project.userauthentication;

import java.util.Scanner;

public class ScannerInstance {
	
	static Scanner scanner;
	
	public static Scanner getScannerInstance(){
		if( scanner==null){
			scanner=new Scanner(System.in);
		}
		return scanner;
	}
	
	public static void  close(){
		if( scanner!=null){
			scanner.close();
		}
		
	}


}
