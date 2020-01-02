package week2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

public class SampleCalendar {
	public static void main(String[] args) 
    {
		Calendar calendar = new GregorianCalendar();
	System.out.println(calendar);
		 Calendar calendar1 = Calendar.getInstance();  
		   System.out.println("The current date is : " + calendar.getTime());  
		   calendar1.add(Calendar.DATE, -15);  
		   System.out.println("15 days ago: " + calendar1.getTime());  
		   calendar1.add(Calendar.MONTH, 4);  
		   System.out.println("4 months later: " + calendar1.getTime());  
		   calendar1.add(Calendar.YEAR, 2);  
		   System.out.println("2 years later: " + calendar1.getTime());  
		   System.out.println(Calendar.getAvailableCalendarTypes());

		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); 
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // months go from 0 to 11, 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);// week starts from sunday to sat 1 to 7 
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);       
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); 
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);
    }
}
