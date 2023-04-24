// write a program to find prime numbers in given array

package assignmentofcreatingprogram;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		int count=0;
		int countc=0;
		for (int i=0; i< a.length; i++) {
			for (int b=1; b<= a[i]; b++) {
				if (a[i]>1 && a[i]%b==0)
					count++;
			
			}if(count==2)
				countc++;
				System.out.println(countc);
		}
		
			 
	}

}
// unsolved
