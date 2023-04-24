package javabreak;

public class JavaBreakClass {

	public static void main(String[] args) {
		// It is used to break the statement
		// Do not write code after break, it will gives error
	System.out.println("Starting code");
	
	
		for(int i=0;i<=5;i++) {
			
			System.out.println("i = "+i);
			break;
		}

		System.out.println("Ending code");
		
		//-------------------------------------------------------
		int a[]= {1,2,3,4,5,6,7,7,8,9};//---------break for foreach
		for(int b:a) {
			
			if(b==6) {
				System.out.println(" 6 is present");
				break;
			}
			
		}
		
	}

}

