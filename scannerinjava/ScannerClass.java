package scannerinjava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// Scanner class is written by java
		// we have to create the obj of scanner class to import it

		Scanner sc = new Scanner(System.in);
		// while creating object choose " System.in "

		byte a = sc.nextByte();
		// nextbyte is method in scanner class and after mouse overing on it, it get
		// information that it is return type and for return we have to create variable
		// of that data type
		// ---- here all data types are available in next but string is not available so
		// we have to choose nextline
		System.out.println(a);
		// here after run as java application, we get blank console means we have to
		// write or give value in it and then pressing entre we get result
	}

}
