package collectionpackage;

import java.util.Collections;
import java.util.HashSet;

// Null is allowed for single time
// Duplicate value is not allowed
// It doesnt depend on index no
//key value pair
// cant sort

public class HashsetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> data= new HashSet<>();
data.add(null);
data.add(78);
data.add(76);
data.add(67);
data.remove(78);

System.out.println(data);

	}

}
