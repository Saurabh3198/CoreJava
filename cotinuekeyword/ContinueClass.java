package cotinuekeyword;

public class ContinueClass {

	public static void main(String[] args) {
		// It is used to stop one iteration and run others
		// It is used only in loop format
		// dont write after continue
		
		
	int a[]= {1,2,3,4,5,6,7,8,9};
	
	for(int i=0; i<a.length;i++) {
		
		if(a[i]==6) {
			continue;
		}
		System.out.println(a[i]);
	}

	}

}
