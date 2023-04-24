package returntypes;

public class ReturnTypeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeClass.sample();
		int t = ReturnTypeClass.sample2();// here we have to create variable to print the element of method
		System.out.println(t);
     ReturnTypeClass obj= new ReturnTypeClass();
     float g= obj.sample3();
     System.out.println(g);
     boolean k= obj.sample4(78, 98);
     System.out.println(k);
	}

	public static void sample() {
		System.out.println("sj");// Void do not return any thing to us. we have to call it in main method
		// void do not require return keyword
	}
	//-----------------------------------------------------------------

	public static int sample2() {
		System.out.println("saurabh");
		int a = 89;
		int b = 78;
		int c = a + b;
		return c;// -- here we remove the void from method so we do not need put syso in the
					// method and
					// put int values in the method so void is replced by the int and now return
					// type is integer so give any int variable in return.

	}
//---------------------------------------------------------------------------------
	public float sample3() {
		float s= 56.67f;
		float c= 45.67f;
		float v= s+c;
		return v;
		
	}
	//--------------------------------------------------------------------------------
	public boolean sample4(int h, int j) {
		
		boolean f= h>j;
				return f;
	}
}
