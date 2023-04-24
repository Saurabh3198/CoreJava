package encapsulation;
// binding methods and variables together

public class EncapsulationInJava {
	
	int a;
	public void seta(int a) {
		
		this.a =a;// binding
		
		
	}
	public int geta() {// get set method
		
		return this.a; //binding
		
	}
	// this class is encapsulated class
	
	private String name;
	private float abc;// for fetting get set method just right click on variable and then choose source and then choose getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAbc() {
		return abc;
	}
	public void setAbc(float abc) {
		this.abc = abc;
	}


	
}
