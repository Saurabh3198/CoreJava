package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// Bitwise operator- &,^(xor),|(or)
		int a = 5; // 0000 0000 0000 0000 0000 0000 0000 0101
		int b = 4;// 0000 0000 0000 0000 0000 0000 0000 0100
		// first convernt decimal to binary using online convertor then int contains 4
		// byte means 32 bit so int contain total 32 zeros after that replace last zeros
		// with binary number

		int c = a & b; // result - 0000 0000 0000 0000 0000 0000 0000 0100

		System.out.println(c);
		// if last digit of a is 1 and of b is 0 then result will be zero means b
		// if last digit of a is 1 and of b is 1 then result will be one means a
		// ------------------------------------------------------------------------------

		int d = a | b;
		System.out.println(d);
		// if last digit of a is 1 and of b is 0 then result will be one means a
		// if last digit of a is 1 and of b is 1 then result will be one means a
		// if last digit of a is 0 and of b is 0 then result will be zero means b(1=
		
		// true, 0= false)
		// ------------------------------------------------------------------------------
		int f = a^b;
		System.out.println(f);
		// if last digit of a is 1 and of b is 0 then result will be one
		// if last digit of a is 1 and of b is 1 then result will be zero
		// if last digit of a is 0 and of b is 0 then result will be zero (1= true, 0=
		// false
		// It gives result in true or false means 1 or 0

	}

}
