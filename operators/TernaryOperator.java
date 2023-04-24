package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// ternary operator- ?:(if then else)
		boolean a = true;
		boolean b = false;

		boolean c = a ? true : false;
		System.out.println(c);
		// --------------------------------------
		boolean d = b ? true : false;
		System.out.println(d);
		// here basic rule is applied that before colon is true and after colon is false
		
		//----------------------------------------
		boolean f= a ? false:true;
		System.out.println(f);
		//-----------------------------------
		String df= a ? "hello" : "hii" ;
		System.out.println(df);
		//----------------------------
		int e=b?65:78;
		System.out.println(e);
		//---------------------------------
		int r=67;
		int k=78;
		char z= (r>k)?'A':'B';
		System.out.println(z);
		//------------------------------
		int age=34;
		String g= (age>18)?"you can vote":"you cant vote";
		System.out.println(g);
		//---------------------------
		
				

	}

}
