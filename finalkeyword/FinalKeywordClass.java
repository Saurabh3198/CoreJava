package finalkeyword;
// final keyword can be used with variables, method, class

// we cant use final keyword with constructor
// final means cant change its value
// class level variable should be initialized
// Final variable should be always in capital letter
// If we have constructor in our class then there is no need to initialize class level variables . just we have to declare it at class level nut after in constructor we have to initialize those variables otherwise we will get error

public class FinalKeywordClass {
	final int ABCD = 89;
	static final int PQRS = 33;

	public FinalKeywordClass() {

	}

	public final void sample1() {
		System.out.println(" non static final method");

	}

	public static final void sample() {
		System.out.println(" final static method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
