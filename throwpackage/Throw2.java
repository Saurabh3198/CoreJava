package throwpackage;

public class Throw2 {

	public static void main(String[] args) {
int age=3;
String str1="age is illegal";
		
		if(age>=18) {
			System.out.println(" you can vote");
			
		}else {
			System.out.println(" you cant vote");
			
			ArithmeticException obj=new ArithmeticException(str1); // class present in java
			throw obj;
			
			
			
			
		}

	}

}
