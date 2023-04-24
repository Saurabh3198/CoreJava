package constructor;

public class ConstructorClass {
	// Constructor name should be class name
	// it do not contain return type
	// if we create any constructor in class, then jvm do not create default
	// constructor means we canot call obj without constructor
	// if we do not created any constructor in class, jvm create default one means
	// we can call obj direct without using constructor
	// to use same constructor in same class use
	//1. paratmertized method
	//2. In parameterized method, we cant use same variable type. we can use them by changing theri place
	//3. use different data types
	// class containing multiple constructor is called overload constructor
	// Constructor can not be called by using object
	// constructor only run when create new object of that constructor 
	// Constructor cant be used eith static keyword

	int a;
	String name;

	public ConstructorClass()// ---constructor
	{

		System.out.println(" This is default constructor class");
	}

	// ----------------------------------------------------------------------------
	
	public ConstructorClass(int b) // -------parameterized constructor
	{
		a = b;

	}

	public static void main(String[] args) {
		ConstructorClass obj = new ConstructorClass();
		ConstructorClass obj2= new ConstructorClass(24);

	}

}
