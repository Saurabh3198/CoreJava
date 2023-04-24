package accessmodifiersA;

public class AccessClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessClass obj= new AccessClass();
		obj.publicmethod();
		obj.defaultmethod();
		obj.privatemethod();// cant use
		obj.protectedmethod();
		System.out.println(obj.defaultvariable);
		System.out.println(obj.privatevariable);// cant use
		System.out.println(obj.protectedvariable);
	    System.out.println(obj.publicvariable);

	}

}
