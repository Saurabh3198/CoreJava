package javabreak;

public class JabaBreakClass1 {

	public static void main(String[] args) {
		// to find any letter presenting in array
		char a[] = { 'a', 'b', 'c', 'r', 't', 'r' };

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'r') {
				System.out.println(" R is present");
				break;// --here break is given beacuse we just check r is present or not. we dont have
						// to check how many times r is present
			}

		}

	}

}
