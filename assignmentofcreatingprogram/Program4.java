// Write a program to find given is prime or not

package assignmentofcreatingprogram;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int count=0;// we can make verify the factors and here count shows number of factors
		
		for (int i=1;i<=a;i++) {
			if(a>1 && a%i==0)
				count= count+1;
			
		}// to avoid repetative printing use anothe if else statement after for loop
		if(count==2) {
			System.out.println("It is prime number");
		}else {
			System.out.println(" It is not a prime number");
		}
		//----------------------- Alternative method --------------------------
		
		if (a>1) {
			for ( int i = 1; i<=a; i++) {
				if (a%i==0)
					count++;
				
			}if (count==2) {
				System.out.println(" It is a prime number");
			
			}
			else {
				System.out.println(" It is not a prime number");
			}
		}else {
			System.out.println(" It is not a prime number");
		}
		
		// Just run program individual for accurate result

	}

}
