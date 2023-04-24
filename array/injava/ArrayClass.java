package array.injava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// ARRAY is used to save group on int
		// [] is used for array and for group of integers use { }
		// array can be used after or before variable but after is recommded
		// array cant br resize after creation
		// you can resize at statement of creation
		// in array every no gets index no
		// index no - 0,1,2,3,4______
		// we have to call integer by using index no

		int a[] = { 34, 45, 342, 67, 5 };

		int b = a[2];
		System.out.println(b);
		//a[3] = 23;
		//System.out.println(a[3]); // ------ replacement of no.

		int length = a.length;
		System.out.println(length); // --------------- length of array
		 int ab[]= { 34, 45, 342, 67, 5 };
		 
		 boolean f1 = a==ab; //-----comparing of two arrays(not recommended for arrays)
		 System.out.println(f1);//----result is false because of different memory location
		 int x= 34;
		 int y= 34;
		 boolean v= x==y;//-------comparing of two integer(recommended for integer)
		 System.out.println(v);
		 
		 
		 boolean f2= Arrays.equals(ab, a);//--comparing of arrays( recommended for arrays)
		 
		 System.out.println(f2);
		 Arrays.sort(a);//------sorting of arrays
		 System.out.println(a);
		 

	}

}
