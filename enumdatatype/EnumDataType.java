package enumdatatype;
// we can create our own data type


public class EnumDataType {
	
	public enum week{mon,tue,wed,thur,fri, sat,sun}// we cant start with number like 1.mon but can start like mon1
	
 enum month{jan,feb,march,}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(week.fri);//for printing
System.out.println(month.jan);	

    week ab = week.sun;// assigning values
    week sj = week.mon;
    month ss= month.jan;
    month h = month.feb;
 for (week each:week.values()) {
	 
	 System.out.println(each);
 }

	}

}
