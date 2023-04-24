package poly.methodoverloading;

// to achieve method riding, we need inheritance  means we need different classes. i.e. parent and child class
//  Both classes have same name and same parameter
// if we are creating reference of parent class and constructor of child class, in that case at the compile time method will be referred from parent class but at the run time method execution will be from child class 
public class MethodoveridingA {

	int aa=45;
	static int AA= 55;
	public void addition()
	{
		System.out.println(" This is additon method from MethodOverridingA");
		int c =aa+ AA;
		System.out.println(" Addition ="+c);	
		
	}
	public static void subtraction() 
	{
		System.out.println(" This is subtraction method from MethodoverridingA");
		int c=555-AA;
		System.out.println(" Subtraction ="+c);
	}
	
	

}
