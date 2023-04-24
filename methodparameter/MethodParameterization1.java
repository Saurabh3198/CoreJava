package methodparameter;

public class MethodParameterization1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameterization1 obj = new MethodParameterization1();
		obj.addition();
		MethodParameterization1.subtraction();
		obj.subtraction();

	}

	public void addition() {
		int a = 23;
		int b = 45;
		int c = a + b;
		System.out.println(c);
	}

	public static void subtraction() {
		int d = 56;
		int f = 34;
		int g = d - f;
		System.out.println(g);
	}

}
// non static method can be called by only creating object
// static method can be called by creating object and by class name
