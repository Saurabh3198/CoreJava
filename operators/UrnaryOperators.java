package operators;

public class UrnaryOperators {

	public static void main(String[] args) {
		// unary operators- exp++( post increment by1 expression), exp--(post decrement
		// by1 expression) ,++exp(pre increment by1 expression),--exp(pre decrement by1
		// expression),~(negation),!(not)

		int a = 7;
		int b = 9;

		int c = a++;
		System.out.println(c);
		System.out.println(a);
		// -------------------------------------------
		int d = b--;
		System.out.println(d);
		System.out.println(b);
		// -------------------------------------------
		int f = ++a;
		System.out.println(f);
		System.out.println(a);
		// ----------------------------------------
		int g = --b;
		System.out.println(g);
		System.out.println(b);
		// ------------------------------------

		int h = --a + --b - ++a + --b; /// a-9, b- 7
		System.out.println(h);
		// -----------------------------------
		int j = ++a - ++b + --a + --b + --a; // a=9,b=5
		System.out.println(j);
		// -------------------------------------------
		int k = ~a;// negation= multiply by -1 and then minus 1
		System.out.println(k);
		// ---------------------------------
		boolean f1 = true;
		boolean f2 = !f1;
		System.out.println(f2);

	}

}
