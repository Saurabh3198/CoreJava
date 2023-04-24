package thiskeyword;

public class ThisKeywordAsArgument {
	int a;
	int b;
	
	
	
	
// This can be passed as an argument of current class in the method
	
	public ThisKeywordAsArgument() {
		this.sample(this);
		
	}

	public static void main(String[] args) {
		ThisKeywordAsArgument obj1= new ThisKeywordAsArgument();
		obj1.a=66;
		obj1.b=88;
		obj1.samplenonstaticmethod();
		

	}
 
	public void samplenonstaticmethod() {
		
		this.sample(this);// or sample(this);
		
	}
	public void sample(ThisKeywordAsArgument obj) {
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}
}
