//WAP to find count of even and odd numbers bet 0 to 150


package assignmentofcreatingprogram;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int evencount=0;
	int oddcount=0;
	for (int i=1; i<=150; i++) {
		if (i%2==0) {
			evencount++;
			
		}else {
			oddcount++;
		}
		
	}
	System.out.println("Even Count is "+evencount);
	System.out.println("Odd Count is "+ oddcount);
		
		
		
		
	}

}
