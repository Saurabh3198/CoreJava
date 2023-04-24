package objectclass;

public class HumanBeing2 {
	String name;
	int age;
	float weight;
	public static void main(String[] args) {
		HumanBeing2 obj=new HumanBeing2();
		HumanBeing2 obj2= new HumanBeing2();
		obj.name= "Soham";
		obj.age=24;
		obj.weight= 65f;
		obj2.name= "Sohan";
		obj2.age=23;
		obj2.weight= 63f;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.weight);
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		System.out.println(obj2.weight);
		obj2.age=obj.age;
		System.out.println(obj2.age);
		obj.cantalk();
		obj2.caneat();
		
		
		
	}
	public static void cantalk() {
		System.out.println("he can eat");
		
	}
	public static void caneat() {
		System.out.println("he can eat");
	}

}