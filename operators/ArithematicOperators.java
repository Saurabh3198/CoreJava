package operators;

public class ArithematicOperators {

	public static void main(String[] args) {
		// arithematic operators +.-,*,/,%
		int a = 65;
		int b = 78;
		int c = a + b;
		System.out.println(c);
		int d = b - a;
		System.out.println(d);
		int f = a * b;
		int s = a / b;
		System.out.println(f);
		System.out.println(s);

		String name1 = "hello";
		String name2 = "Saurabh";
		String name3 = name1 + name2;
		System.out.println(name3);
		System.out.println(name1 + name2);
		System.out.println(a + b);
		System.out.println(a + name1);
		System.out.println(name1 + a);
		System.out.println(a + b + name1);
		System.out.println(name1 + a + b);
		//------------------------------------------------
		
		System.out.println(a-b);
		/*System.out.println(a-name1);    ------ not possible
		System.out.println(name1-a);    ------ not possible
		System.out.println(a-b-name1);   ------ not possible
		System.out.println(name1-a-b);   ------ not possible*/
		
		//---------------------------------------------------
		System.out.println(a*b);
		
		/*System.out.println(a-name1);    ------ not possible
		System.out.println(name1-a);    ------ not possible
		System.out.println(a-b-name1);   ------ not possible
		System.out.println(name1-a-b);   ------ not possible*/
		
		//------------------------------------------------
		
		System.out.println(a/b);
		
		/*System.out.println(a-name1);    ------ not possible
		System.out.println(name1-a);    ------ not possible
		System.out.println(a-b-name1);   ------ not possible
		System.out.println(name1-a-b);   ------ not possible*/
		//-------------------------------------------------
		
		System.out.println(a%b);
		
		/*System.out.println(a-name1);    ------ not possible
		System.out.println(name1-a);    ------ not possible
		System.out.println(a-b-name1);   ------ not possible
		System.out.println(name1-a-b);   ------ not possible*/
		//-------------------------------------------------
		
	}

}
