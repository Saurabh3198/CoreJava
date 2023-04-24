package accessmodifiers;

import accessmodifiersA.AccessClass;

public class AccessClassForASubClass extends AccessClass {
	public static void main(String[] args) {
		
		AccessClassForASubClass obj= new AccessClassForASubClass();
		
		
		obj.publicmethod();
		obj.defaultmethod();// cant use
		obj.privatemethod();// cant use
		obj.protectedmethod();
		System.out.println(obj.defaultvariable);//cant use
		System.out.println(obj.privatevariable);// cant use
		System.out.println(obj.protectedvariable);// 
	    System.out.println(obj.publicvariable);

	}
	
	
	
	
	

}
