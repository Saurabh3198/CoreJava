package scannerinjava;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
		//  login password code
		
		int a = 7898; // a is login passcode
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter your login passcode= ");
		
		int b= obj.nextInt();
		
		if (a==b) {
			System.out.println(" You have logged in sucessfully");
			
		}else {
			
			System.out.println(" Your passcode is incorrect. please try again");
		}
		
	}

}
