package scannerinjava;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		System.out.println(" This method is for addition of two numbers");
		
		Scanner obj= new Scanner(System.in);
		System.out.println(" Entre the first intger....");
		
		int c= obj.nextInt();
		
		System.out.println(" Enter the second integer.....");
		int a= obj.nextInt();
		
		int b = c+a;
		System.out.println(" Addition = "+b);
		
	}

}
