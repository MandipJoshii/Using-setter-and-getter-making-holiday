# Using-setter-and-getter-making-holiday
In this code i have create a setter and getter code where following instruction are carried out respectively...
//The Java class called Holiday is started below. An object of class Holiday
//represents a holiday during the year. This class has three member/instance
//variables:
//name, which is a String representing the name of the holiday.
 //day, which is an int representing the day of the month of the holiday.
 //month, which is a String representing the month the holiday is in.
// holiday, which is a Boolean representing the status of the holiday.(which
//takes true or false value)
//public class Holiday {
//private String name;
//private int day;
//private String month;
//private boolean holiday;
// your code goes here
//}
//a) Define getters and setters for the variables of Holiday class.
//b) Write a method isHoliday() , to return weather holiday has been given or
//not.
//c) Write a piece of code that creates a Holiday instance. [Take user input with
//the name “Constitution day”, with the day “3”, and with the month “Ashoj”
//and holiday is “true”.]
//Write main function to take input and call the setters and getters methods of
//Holiday class.

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
	    
		boolean holi = scan.nextBoolean();

	    	
			 h.set_name(name);
			 h.set_day(day);
			 h.set_month(month);
			 h.set_holiday(holi);
			 
			 String detail = h.isHoliday();
			 
			 System.out.println(detail);
		}

}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package lab_Report3;

public class default_Holiday {
private String name;
private int day;
 private String month;
private Boolean holiday;


public void set_name(String name) {
	this.name = name;
   }

public void set_day(int day) {
	this.day = day;
   }


public void set_month(String month) {
	this.month = month;
   }

public void set_holiday(Boolean holiday) {
	this.holiday = holiday;
   }

public String get_name() {
	return name;
   }

public int get_day() {
	return day;
   }

public String get_month() {
	return month;
}

public boolean get_holiday() {
	return holiday;
	
   }

public String isHoliday() {
	return "Holiday" + "[ " +  "Name = " + name + ", Day = " + day + ", Month = " + month + ", Holiday = " + holiday + "]";
}
}
