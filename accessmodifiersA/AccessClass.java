package accessmodifiersA;
// access modifiers types- 1. public 2. private 3. default 4. protected
// it behave same for static and non static method and constructor
// class has only two modifiers 1. public, 2. default

public class AccessClass {
	public int publicvariable=78;
	private int privatevariable=89;
	 int defaultvariable=90;// default modifiers
	protected int protectedvariable=91;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessClass obj= new AccessClass();
		obj.publicmethod();
		obj.defaultmethod();
		obj.privatemethod();
		obj.protectedmethod();
		System.out.println(obj.defaultvariable);
		System.out.println(obj.privatevariable);
		System.out.println(obj.protectedvariable);
	    System.out.println(obj.publicvariable);

	}
	public void publicmethod() {
		
		System.out.println(" public method");
		
	}
private void privatemethod() {
		
		System.out.println(" private method");
		
	}
protected void protectedmethod() {
	
	System.out.println(" protected method");
	
}
 void defaultmethod() {
	
	System.out.println(" default method");
	
}

}
