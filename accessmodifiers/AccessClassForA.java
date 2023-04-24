package accessmodifiers;

import accessmodifiersA.AccessClass;

public class AccessClassForA  {

	public static void main(String[] args) {
		// TODO Auto-generated method stubAccessClass obj= new AccessClass();
		AccessClass obj= new AccessClass();
		obj.publicmethod();
		obj.defaultmethod();// cant use
		obj.privatemethod();// cant use
		obj.protectedmethod();//cant use
		System.out.println(obj.defaultvariable);//cant use
		System.out.println(obj.privatevariable);// cant use
		System.out.println(obj.protectedvariable);// cant use
	    System.out.println(obj.publicvariable);


	}

}
