package collectionpackage;
// It will do sorting automatically
// null value is not allowed
// Duplicate value is not allowed


import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> data= new TreeSet<>();
		data.add(89);
		data.add(78);
		//data.add(null);
		//data.add(null);
		data.add(45);
		data.add(23);
		data.add(89);
		data.remove(89);
		
		
		
		System.out.println(data);

	}

}
