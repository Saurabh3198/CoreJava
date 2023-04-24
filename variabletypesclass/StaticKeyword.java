package variabletypesclass;

public class StaticKeyword {
	int a =89;
	String name="Saurabh";
	static int ab;
	static char ch;
	public static  void sampleStaticMethod( ) {
		
		System.out.println("sample static method");
	}
	
	public void sampleNonStaticMethod() {
		
		System.out.println(" sample non static method");
	}
	public static void main(String[] args) {
		
		StaticKeyword.ab=89;
		System.out.println(StaticKeyword.ab);
		System.out.println(StaticKeyword.ch);
		
		StaticKeyword.sampleStaticMethod();
		//StaticKeyword.sampleNonStaticMethod(;) // not possible to call non static method using class name
	
	StaticKeyword obj=new StaticKeyword();
	System.out.println(obj.a);
	System.out.println(obj.name);
System.out.println(obj.ab);
System.out.println(obj.ch);
obj.sampleNonStaticMethod();
obj.sampleStaticMethod();
	
	}

}
