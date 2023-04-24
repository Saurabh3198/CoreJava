package returntypes;

public class ReturnTypeClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeClass2 oo=new ReturnTypeClass2();
		
		
		StudentClassForReturn2 obj = oo.studentclassinstance();
		obj.getstudentinformation();
		
		
		StudentClassForReturn2 ab= new StudentClassForReturn2();
		oo.sample(ab);
		ab.getstudentinformation();
		
		String f=oo.getstring("soham", "Saurabh");
		System.out.println(f);
		
		
		
		
		
		

	}
	public String getstring (String a, String b) {
		String c= a+b;
		return c;
		
		
		
	}
	
	public void sample(StudentClassForReturn2 o) //-- here we use parameterized method 
	
	{
		o.name = "Soham";
		o.rollnumber= 67;
		
		
		
	}
	//------------------------------------------------------------------------------
	
	public StudentClassForReturn2 studentclassinstance() {
		 StudentClassForReturn2 obj=new StudentClassForReturn2();
		 obj.rollnumber = 45;
		 obj.name = "Saurabh";
		 return obj;
		 
		
		
	}

}
