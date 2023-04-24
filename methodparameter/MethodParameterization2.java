package methodparameter;

public class MethodParameterization2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameterization2 obj = new MethodParameterization2();
		obj.additionb(65, 89);
		obj.additionb(56, 78);
		MethodParameterization2.subtraction(67, 56);
		MethodParameterization2.subtraction(45, 34);
		obj.sub(45.45f, 40);
	}

	public void additionb(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void subtraction(int a, int b) {
		int d = a - b;
		System.out.println(d);
	}
	public void sub(float a, int b) {
		float c= a-b;
		System.out.println(c);
	}

}
// In methodparameterization1, we can calculate only mention values of variables
// here in methodparameterization2 we can calculate any values just creating local variables at method level