// find prime numbers btewwen 0 to 100

package assignmentofcreatingprogram;

public class Program8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count=0;
	int countc=0;
	
	for(int i=1; i<=100;i++) {
		
		for(int j=1; j<=i/2; j++) {
			
			if(i>1 && i%j==0)
				count++;
			
		}
		if(count==2)
			countc++;
		System.out.println(countc);
		
	}
	
	
	
	}}
// unsolved


