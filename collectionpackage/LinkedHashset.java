package collectionpackage;
// Null value is allowed for single time
// Duplicate value is not allowed and it will not give any exception
// Sorting is not allowed.  It gives exception
// It doesnt depend on index no

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 LinkedHashSet<Integer> data= new LinkedHashSet<>();
	 data.add(90);
	 data.add(90);
	 data.add(89);
	 data.add(67);
	 data.add(65);
	 //data.add(null);
	 //data.add(null);
	 data.add(45);
	 data.remove(90);
	// Collections.sort(data);
	 
	 
	 System.out.println(data);
	 
		

	}

}
