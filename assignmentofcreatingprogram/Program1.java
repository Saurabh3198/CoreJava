// Write a program to find even and odd numbers in array

package assignmentofcreatingprogram;

public class Program1 {
	
	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7};
		 
	for(int i=0; i<a.length; i++)// even numbers 
	{
		
		if(a[i]%2==0) {
			
		System.out.println(a[i]);
		}
		
	}
//-----------------------------------------------------------------------	
	
	for(int i=0; i<a.length;i++) // odd numbers
	{
		
		if(a[i]%2!=0)
			System.out.println(a[i]);
	}
	//---------------------------------------------------
	
	for (int value:a)//-------advanced method to find even numbers
	{
		if(value%2==0)
			System.out.println(value);
	}
	//-------------------------------------------------------
	for (int value:a)
	{
		if(value%2!=0)
			System.out.println(value);
	}
	
	}

}
