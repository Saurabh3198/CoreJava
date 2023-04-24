package ifstatement;

public class NestedIf {

	public static void main(String[] args) {
		// It is used to use another if statement in other if statement
		System.out.println("starting code");
		int a = 60;
		int b = 61;
		if (a > 30) {
			System.out.println("Saurabh");

			if (b < 60) {
				System.out.println("Soham");
			} else {
				System.out.println(" Shivani");
			}
		}
		System.out.println("ending code");

// in nested if condition, inside condition only run when first condition pass
//-------------------------------------------------------------------------------------

		boolean f1 = false;
		if (a > 70) {
			System.out.println("saurabhj");
			if (f1) {
				System.out.println("Sohamj");
			}
		} else {
			System.out.println("Shiavnij");
			if (b > 60) {
				System.out.println("Saurabh Jadhav");
			}
		}

	}
}
