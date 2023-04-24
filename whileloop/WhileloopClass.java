package whileloop;

public class WhileloopClass {

	public static void main(String[] args) {
		// While loop syntax-
		// while(condition){
		
		
		//    }
		
		
		int a=8;
		
		while(a<9) {
			System.out.println("Saurabh");
			a++;
		}
		// here we get infinite result of saurabh so to stop this we have to give false logic i.e. a++
		//-------------------------------------------------------------------------
		
		for(;a<9;) //---------- converting for loop into while loop
		{
			System.out.println("Soham");
			a++;
		}
		
	}

}
