package poly.methodoverloading;
// non static method will refer from parent class for compile time but run will be from child class for runtime
// static method will refer from parent class for compile time and run will be from parent class for run time
// Means for method overriding, we need the non static method and it is only for method. 
// variable should be referred and run will be from same class


public class MethodoveridingB extends MethodoveridingA {

	int bb=46;
	static int BB= 56;
	public void addition()
	{
		System.out.println(" This is additon method from MethodOverridingB");
		int c =bb+ BB;
		System.out.println(" Addition ="+c);	
		
	}
	public static void subtraction() 
	{
		System.out.println(" This is subtraction method from MethodoverridingB");
		int c=556-BB;
		System.out.println(" Subtraction ="+c);
	}
	public static void main(String[] args) {
		MethodoveridingA obj= new MethodoveridingB();
		System.out.println(obj.aa);
		System.out.println(obj.AA);
		obj.addition();
		obj.subtraction();
		
	}
	
	

}
