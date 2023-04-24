package ifstatement;

public class IfElseLadder {

	// if else ladder syntax- if(condition){ }else if (ocndition){ }else
	// if(ondition){ } -------- else{ }
	// It is used when there are multiple conditions but we have pass just one
	
	public static void main(String[] args) {
		int marks=35;
		if (marks>=65) {
			System.out.println("passed with distinction");
		}
		else if(marks<65 && marks>=55) {
			System.out.println("passed with first class");
		}
		else if (marks<55 && marks>=45) {
			System.out.println(" passed");
			
		}
		else {
			System.out.println("failed");
		}
		
	//---------------------------------------------------------------
		char ch ='A';
		if(ch=='A') {
			System.out.println("it is vowel"+ ch);
				}
		else if (ch=='D'){
			System.out.println("it is vowel"+ ch);	
		}
		else {
			System.out.println("it is not vowel");
		}
	}
	
	
		
		
	}

