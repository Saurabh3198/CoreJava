package StringInjava;

public class StringClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = " welcome to KTCTC";
		char ch = str1.charAt(3);// string method---- print letter as per index no
		System.out.println(ch);
		// --------------------------------------------
		int a = str1.length();// ----- calculate the length
		System.out.println(a);
		// -----------------------------------
		boolean f = str1.endsWith("KTCTC");// --- check the sequence with ending
		System.out.println(f);
		// ----------------------------------------
		boolean g = str1.startsWith(" welcome to");// --- check with sequence with staring
		System.out.println(g);
		// ------------------------------------------
		String dd = str1.replace('o', 'A');// ------replace character
		System.out.println(dd);
		// -----------------------------------------------
		String h = str1.trim();// trim the outer spaces
		System.out.println(h);
		// --------------------------------------------------
		String[] j = str1.split(" ");//-----split up 
		System.out.println(j);
		//-----------------------------------------------------
		String s= str1.substring(2);//--- it will exclude letter according to index no.
		System.out.println(s);
		//----------------------------------------
		String l= str1.substring(2, 7);
		System.out.println(l);//--- it will gives part between two index no
		//----------------------------------------
		boolean m= str1.contains("w");
		System.out.println(m);// it check given data is present or not
		//---------------------------------------------
	String str2= "Saurabh";
	boolean f5= str1.equals(str2);
	System.out.println(f5);// check two string are equal or not
	//-------------------------------------------------
	String i=str1.concat(str2);
	System.out.println(i);// concat two string
	//---------------------------------------------
	String str3= " welcome to ktctc";
	boolean f6= str1.equalsIgnoreCase(str3);
	System.out.println(f6);//check two string are equal or not without considering case sensation
	//----------------------------------------------
	String f7= str1.toLowerCase();
	System.out.println(f7);// to convert on small letters
	//-------------------------------------------------
	String o= str1.toUpperCase();
	System.out.println(o);// to convert all capital letters

	}

}
