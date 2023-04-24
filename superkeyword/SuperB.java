package superkeyword;

public class SuperB extends SuperA {
	int aa=440;
	static int AA=450;
	
	public static void staticmethod() {
		
		System.out.println(" This is static method from SuperB");
		
		
	}
	public void nonstaticmethod() {
		
		System.out.println(" This is non static method from SuperB");
		System.out.println(aa);
		System.out.println(AA);
		System.out.println(super.aa);
		System.out.println(super.AA);
		System.out.println(abc);
		staticmethod();
		super.nonstaticmethod();
		super.staticmethod();
	
	}
	public static void main(String[] args) {
		SuperB obj=new SuperB();
		obj.staticmethod();
		obj.nonstaticmethod();
		
	}

}
