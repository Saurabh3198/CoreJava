package abstractpackage;
// abstract class declared with abstract keyword

//it contain method without implementation
// it may contain concrete methods
// a method defined abstract must always be redefined in the subclass, thus making overriding compulsory or either make subclass itself abstract
//there can be no object of an abstract class that is an abstract class can not be directly initialized with the new operator
// abstract class can have parameterized constructor or default constructor is always present in an abstract class
// public static final is not default
// public is default
public abstract class AbstractClass {
	int i=90;
	public static final int  j=89;
	
	
	
	public AbstractClass()// default constructor can be created
	{
		
		
		
	}
	
	public AbstractClass(int a) {
		
		
		
	}
	abstract public void test1();// method which will not be implemented is declared by abstract keyword
	
public void test2() // dont need abstract declaration for implementing  method
{
	
	
}
	
	
	
	
	
	
	
}
