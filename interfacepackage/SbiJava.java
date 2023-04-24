package interfacepackage;
// use implements keyword when parent class is interface
// after we have to implement method of interface in child class

public class  SbiJava implements RBI {

	@Override//-------- annotation- label for method-- not mandatory to write annotation
	public void homeloaninterestrate() {
		// TODO Auto-generated method stub
		System.out.println(" Home Loan Interest =7.5%");
		
	}

	@Override
	public void carloaninterestrate() {
		// TODO Auto-generated method stub
		System.out.println(" Car loan interest=7%");
		
	}
	public void goldloan() {
		
		System.out.println(" gold loan=8%");
		
	}
public static void main(String[] args) {
	
	RBI ab=new SbiJava();
	
	//RBI oo = new RBI();//--- we cant create obj of interface class
	ab.carloaninterestrate();
	ab.homeloaninterestrate();
	
	
	
	SbiJava obj= new SbiJava();
    obj.homeloaninterestrate();
    obj.carloaninterestrate();
    obj.goldloan();
    
}
	
}
