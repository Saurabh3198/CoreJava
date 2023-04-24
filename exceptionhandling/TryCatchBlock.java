package exceptionhandling;
// after exception in try block further code in try block will not run it goes to the catch block

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45;
		int b=0;
		int c;
		String data="Saurabh";
		try {
			
		c=a/b;
		System.out.println(Integer.parseInt(data));
		System.out.println("Saurabh");
	}
		catch (Exception e) {
			// TODO: handle exception
			c=a;
			e.printStackTrace();// gives the information about exception 
			
		}
		System.out.println(c);
		
		System.out.println("After code");
		
		
		

	}

}
