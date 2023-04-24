package forloop;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			System.out.println("Integer Value I = " + i);
			for (int j = 0; j < 3; j++) // in for loop , for single statment there is no need of curly bracket like if
										// statement

				System.out.println("Integer Value j= " + j);

		}

	}

}
