package forloop;

public class ForEachLoop {

	public static void main(String[] args) {
		// For reach loop will work only class having many elelments
		
		int a[]= {23,45,67,89,34,12,24,65,65,54};
		
		for(int saurabh: a) //---- for printing single element each
		{
			
			System.out.println(saurabh);
			
		}
//------------------------------------------------------------------------
		
		char b[]= {'A','B','C'};
		for (char soham:b) {
			System.out.println(soham);
			
		}
		
		//--------------------------------------------------------------------
		
		String ss[]= { "Saurabh","Soham","Shivani"};
		for(String Shivan:ss) {
			System.out.println(Shivan);
		}
	
	}
}
