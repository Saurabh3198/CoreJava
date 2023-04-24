package exceptionhandling;
// Multiple exception

public class TryCatchBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=98;
 int b=0;
 int c=0;
 String data= "Saurabh";
 try {
		
		c=a/b;
		
		
	}
		catch (ArithmeticException e) {
			// TODO: handle exception
			c=a;
			
			
		}
 System.out.println(c);
  try {
	  System.out.println(Integer.parseInt(data));
  }
 catch (NumberFormatException e) {
	// TODO: handle exception
	 System.out.println("please check string value");
 }
		
		
		System.out.println("After code");
 
		
		
	}

}
