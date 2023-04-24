package forloop;

public class ForLoopClass2 {

	public static void main(String[] args) {
		// printing array by using for loop
		int arr[] = { 23, 45, 67, 68, 79 };

		for (int i = 0; i < 5; i++) {

			System.out.println(arr[i]);

		}
		// -------------------------------------------------------
		System.out.println("----------------------------------------");

		for (int i = 0; i < arr.length; i++) // alternate method for printing array use length of array
		{

			System.out.println(arr[i]);
		}
		// here we put <length not <= length because here lenth gives u no 7 but
		// accodring to index no, this array contain 6 integer
		
		System.out.println("--------------------------------------");
		
		for(int i= arr.length-1; i>=0; i--) // printing array in reverse direction 
		{
			
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------------------------");
		
		char a[]= {'A','B','C','D','E','F'};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---------------------------------------------------");
		
		for(int i=arr.length-1; i>=0;i--) {
			
			System.out.println(a[i]);
		}

	}

}
