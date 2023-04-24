package wrapper;
// all data types are same just put first capital letter
// and int = Integer & char= Character

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Integer aa= new Integer(56);
		int i=aa.intValue();//-------unboxing( object value to int)
		//---------------------------------------------------
		
		int a=55;
		Integer bb=new Integer(a);//--------- inboxing( int value to object
		
		// Integer bb= Integer.valueof(a);----- we can write this way also
		//------------------------------------------------------------------
		Integer abc=23;
		int z= abc;//----- unbxing--- directway----recommanded
		System.out.println(z);
	//---------------------------------------------------------------------------	
		int v=90;
		Integer zx= v;//-------inboxing----directway--recommaneded
		System.out.println(zx);
	//---------------------------------------------------------------------------
		String str="45676";//--------string to integer(only number will convert otherwise we will get exception error
		Integer abb=new Integer(str);
		System.out.println(abb);
		//----------------------------------------------------
		String cv="4567";
		int m = Integer.parseInt(cv);//--------alternate and recommended method
		System.out.println(m);

	}
	 

}
