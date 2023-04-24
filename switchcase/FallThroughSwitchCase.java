package switchcase;

public class FallThroughSwitchCase {
	public static void main(String[] args) {
		int a = 2;
		switch (a) {
		case 1:
			System.out.println("saurabh");

		case 2:
			System.out.println("saurabh1");
			System.out.println("saurabh1");
			System.out.println("saurabh1");

		case 3:
			System.out.println("saurabh2");
			System.out.println("saurabh2");

		case 4:
			System.out.println("saurabh3");

		default:
			System.out.println("soham");

		}
	}

}
// in falltrough switch case, there is no break point
// so that once case it match, it print that case and also further all cases
