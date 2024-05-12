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