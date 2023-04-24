package inheritance;
// here we have to make Inheritance B Child of Inheritance A

// We can access things from parent class to child class but not from child class to parent class
// to acess from child class to parent class we have to create child class object in parent class 

public class InheritanceB extends InheritanceA { // Making child
	int bb = 78;
	static int BB = 90;

	public void nonstaticmethodB() {

		System.out.println("Non Static method from B");
		System.out.println(aa);
		System.out.println(AA);
		nonstaticmethodA();
		staticethodA();
		System.out.println(bb);
		System.out.println(BB);

	}

	public static void staticethodB() {
		System.out.println(" Static method from B");
		System.out.println(AA);// only static member
		System.out.println(BB);
		staticethodA();
		staticethodB();

	}

	public static void main(String[] args) {
		InheritanceB obj = new InheritanceB();
		obj.nonstaticmethodA();
		obj.nonstaticmethodA();
		obj.staticethodA();
		obj.staticethodB();
	}
	// code will not run as interchangeable mutiple values. this code shows things
	// we can access

}
