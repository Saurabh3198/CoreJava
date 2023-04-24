package poly.methodoverloading;

public class MethodOverloading {
	int a=37;
	int b= 56;
	// for methodoverloading, method name should same but different parameter
	// Methodoverloading is example of compile time and polymorphism
	
	

	public MethodOverloading() {
		// TODO Auto-generated constructor stub
		
		
		
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.addition();
		obj.addition(45.45f, 67.78f);
		obj.addition(67, 78);
		MethodOverloading.subtraction(89.78f, 78.89f);
		MethodOverloading.subtraction(67, 56);
		
		
	}
	public void addition() {
		int c=a+b;
		System.out.println("Addition="+c);
		
	}
	public void addition(int a, int b) {
		
		int c=a+b;
		System.out.println("Addition "+c);
	}
	public void addition(float a, float b) {
		float c= a+b;
		System.out.println(" Addition= "+c);
		
		
	}
	public static void subtraction(float a, float b) {
		float c= a-b;
		System.out.println("Subtraction = "+c);
	}
	public static void subtraction(int a, int b) {
		int c= a-b;
		System.out.println(" Subtraction= "+c);
		
	}

}
