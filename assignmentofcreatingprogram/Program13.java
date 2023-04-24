// WAP to for login access with three attempt



package assignmentofcreatingprogram;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int a = 7898; 
		  int i=1;
		  
		
		do {
			i++;
			
			System.out.println(" Entre your Passcode");
			Scanner obj = new Scanner(System.in);
			int b= obj.nextInt();
			if(a==b) {
				System.out.println("successful");
				break;
			}else {
				System.out.println("unsuceesful please try again");
				
				
			}if(a!=b && i== 4) {
				System.out.println(" blocked");
				break;
			}
			
			 
		}while(i<=4);
		
		// not written neatly .. try again
		
		  
			 
		  
				
			
			
			
			
				
			

	}

}
