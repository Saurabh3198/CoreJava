package encapsulation;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationInJava obj = new EncapsulationInJava();
		obj.seta(67);
		System.out.println(obj.geta());
		obj.setAbc(67.75f);
		obj.setName("Saurabh");
		System.out.println(obj.getAbc());
		System.out.println(obj.getName());

	}

}
