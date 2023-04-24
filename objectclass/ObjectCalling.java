package objectclass;

public class ObjectCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticCalculationClass obj = new ArithmeticCalculationClass();
		HumanBeing obj2 = new HumanBeing();
		obj2.name = "Anna";
		System.out.println(obj2.name);
		obj.a = 55;
		obj.b = 67;
		obj.addition();
		obj.subtraction();

		ArithmeticCalculationClass obj3 = new ArithmeticCalculationClass();
		obj3.a = 6;
		obj3.b = 8;
		obj3.addition();
		obj3.subtraction();

	}

}
