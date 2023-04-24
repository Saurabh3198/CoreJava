package thiskeyword;

public class ThisKeywordClass {
	int a = 90;// ---- instance variable
	static int b = 67;// ----- instance variable

	public static void main(String[] args) {
		// It is reference variable that refers to the current object
		// This keyword refer instance variable.
		// It is used in non static method and constructor
		// We can call static method and non static method by using this keyword in non
		// static method
		// We can call non static and static method by using this keyword in constructor
		// We can call Constructor in another constructor by using this keyword but only one
		// We can method in constructor by using this keyword
		ThisKeywordClass obj = new ThisKeywordClass();
		obj.a = 56;
		obj.b = 79;
		obj.sample();

	}

	public void sample() {
		int a = 92;// ----local variable
		int b = 78;// ---- local variable

		System.out.println(a);// ---it will print local variable value

		System.out.println(b);// -------it will print local variable value
		System.out.println(this.a);// --- it will print instance variable value
		System.out.println(this.b);// --- it will print instance variable value
		this.Sample3();// --- non static method calling by using this keyword
		this.sample4();// Static method calling by using this keyword
		// this(77);//--- cant call constructor in method by using this keyword
		
		

	}

	public static void sample1() {

		int a = 89;
		int b = 78;
		System.out.println(a);
		System.out.println(b);
		// we can not use this in static method because when we use non static method,
		// this accuire the identity of object but when use the static method, we can
		// call it by using class name means this keyword only use when we can create
		// the object of that method

	}

	public void Sample3() {

		System.out.println(" SAURABH");
	}

	public static void sample4() {

		System.out.println("Soham");
		
	}
	public ThisKeywordClass() {
		this(56);//-- constructor calling. but it should be the first statement
		System.out.println("Saurabh");
		
	}
	public ThisKeywordClass(int a) {
	//	this();// we cant call interchanble constructor
		System.out.println("Soham");
	}
	public ThisKeywordClass(float a) {
		this();//----- Constructor calling
	}

}
