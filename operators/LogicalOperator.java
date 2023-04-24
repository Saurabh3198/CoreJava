package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// logical operator - && (and),||(or)-----(works on boolean tye)
		boolean a = true;
		boolean b = false;
		boolean c = a && b;
		System.out.println(c);
		// if both are true then only result will be true otherwise result will be false
		// ---------------------------------------------------------------------------------

		boolean d = a || b;
		System.out.println(d);
		// if both are false then only result will be false otherwise result will be
		// true
		// -------------------------------------------------------------------------------

		// bitwise operator work in replace of logical operators and result will be same
		// logical operator can not work in replace of bitwise operator as its requires
		// boolean values

	}

}
