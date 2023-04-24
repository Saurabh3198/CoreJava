package operators;

public class ShiftOperator {

	public static void main(String[] args) {
		// Shift Operator- <<,>>

		int a = 5; // 0000 0000 0000 0000 0000 0000 0000 0101
		int b = 4;// 0000 0000 0000 0000 0000 0000 0000 0100

		int c = a << 2; // 00 0000 0000 0000 0000 0000 0000 010100----- formula a*2^n--- where n is
						// shifting no
		System.out.println(c);

		int d = a >> 2; // 000000 0000 0000 0000 0000 0000 0000 01---- formula a/2^2 --- where n is
						// shifting no
		System.out.println(d);

	}

}
