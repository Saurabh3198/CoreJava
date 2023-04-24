package wrapper;
//----only in wrapper class we can print direct object

public class WrapperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=67;
		String str="68";
		byte m= Byte.parseByte(str);
		System.out.println(m);
		
		//----------------------------
		byte b= 78;
		Byte bv= b;
		System.out.println(bv);
		//------------------------------
		
	}

}
