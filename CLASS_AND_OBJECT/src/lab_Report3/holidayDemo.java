package lab_Report3;
import java.util.Scanner;
public class holidayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		default_Holiday h = new default_Holiday();
		
//		 h.set_name("Constitution day");
//		 h.set_day(3);
//		 h.set_month("Ashoj");
//		 h.set_holiday(true);
		 
//		 String detail = h.isHoliday();
		 
//		 System.out.println(detail);
		
		
		 
		System.out.println("ENTER THE NAME");
		String name = scan.next();
		
		System.out.println("ENTER THE DAY [1-7] ");
		int day = scan.nextInt();
		
		System.out.println("ENTER THE MONTH");
		String month = scan.next();
		
	    System.out.println("ENETR THE BOOLEAN VALUE TO KNOW THE TRUE OR FALSE VALUE");
	    boolean holiday = false;
	    
	   // System.out.println("ENTER THE MONTH");
		boolean holi = scan.nextBoolean();
//	    if(!holiday == false) {
////	    	boolean holiday = false;
////	    	System.out.println(false);
//	    	System.out.println(false);
//	    }else {
//	    	System.out.println(true);
//	    }
//	    	
			 h.set_name(name);
			 h.set_day(day);
			 h.set_month(month);
			 h.set_holiday(holi);
			 
			 String detail = h.isHoliday();
			 
			 System.out.println(detail);
		}

}
