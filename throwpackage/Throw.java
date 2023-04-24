package throwpackage;

public class Throw {

	public static void main(String[] args) {
		
		int age=3;
		
		if(age>=18) {
			System.out.println(" you can vote");
			
		}else {
			System.out.println(" you cant vote");
			
			ArithmeticException obj=new ArithmeticException(); // class present in java
			throw obj;
			
			
			
			
		}
		
		
		
		
		
	}

}
