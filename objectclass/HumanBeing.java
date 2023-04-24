package objectclass;

public class HumanBeing {
	String name;
	int age;
	float weight;
	public static void main(String[] args) {
		HumanBeing obj=new HumanBeing();
		HumanBeing obj2= new HumanBeing();
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
	}

}