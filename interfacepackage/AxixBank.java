package interfacepackage;

public class AxixBank implements RBI {

	@Override
	public void homeloaninterestrate() {
		// TODO Auto-generated method stub
		System.out.println("home loan interest rate=8.5");
		
	}

	@Override
	public void carloaninterestrate() {
		// TODO Auto-generated method stub
		
		System.out.println("car loan intyerest rate =7.9");
		
	}
	public void personalloan() {
		
		System.out.println(" personal loan = 9");
		
	}
	public static void main(String[] args) {
		AxixBank obj= new AxixBank();
		RBI ab= new AxixBank();
		obj.carloaninterestrate();
		obj.homeloaninterestrate();
	}

}
