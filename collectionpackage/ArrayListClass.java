package collectionpackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> data= new ArrayList<>();//--here in bracket we have to put class name. and integer is class
		Integer a= new Integer(89);
		Integer b= new Integer(90);
		data.add(b);
		data.add(a);
		data.add(new Integer(78));// to add data in array list
		
		data.add(45);
		data.add(67);
		Integer z =data.get(2);
		 Integer y =data.get(3);
		 Integer o = data.get(4);//--To print data in array list
		 data.remove(0);// ---- to remove data as per index no
		 data.remove(a);// ---to remove data as per object
		 data.add(67);
		 data.add(45);
		 data.add(23);
		 data.set(0, 777);//---to update the array list
		 int c= data.size();//------ to get size of array list
		// Collections.sort(data);//---to sort data
		
		
		
		System.out.println(o);
		System.out.println(y);
		System.out.println(z);
		System.out.println(data);
		System.out.println(c);
		
		for(int i=0; i<=data.size()-1;i++) {//--- to get each single data
			
			System.out.println(data.get(i));
			
			
		}
		
		
		
	}

}
