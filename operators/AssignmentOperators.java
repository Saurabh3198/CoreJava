package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// Assignment Operators- =, +=,-=,*=,/=,%=,<<=,>>=

		
		int a=5;
		int b=4;
		a>>=b;
		System.out.println(a);
		
		//--------------------------------
		a<<=b;
		System.out.println(a);
		
		//-----------------------------
		a%=3;
		System.out.println(a);
		//-----------------------------
		a/=b;
		System.out.println(b);
		//-------------------
		a*=b;
		System.out.println(a);
		//-------------------------
		a-=4;
		System.out.println(a);
		//--------------------
		b+=10;
		System.out.println(b);
		//--------------------------
		b+=a;
		System.out.println(b);
		//---------------------------------------
		a=b;
		System.out.println(a);
	}

}
