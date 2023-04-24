package FinallyBlock;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=89;
		int b= 0;
		try {
			System.out.println("i m inside try block");
			int c= a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" i m inside catch block");
			e.printStackTrace();
		}
		finally {
			System.out.println(" i m insisde finally");
		}
		
		
		

	}

}
