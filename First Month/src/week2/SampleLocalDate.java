package week2;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.text.DateFormat;  


public class SampleLocalDate 
{

	public static void main(String ar[])
	{
	LocalDate date=LocalDate.of(2019,Month.OCTOBER,7);
	System.out.println(date);
//	String d="23/06/2019";
//	System.out.println(d);
	String oct="10";
			System.out.println(Date.valueOf(oct));
	int d=date.getDayOfMonth();
	int m=date.getMonthValue();
	int ys=date.getDayOfYear();
	int y=date.getYear();
	System.out.println(y);
	System.out.println(m);
	System.out.println(ys);
	System.out.println(d);
//	Date tdy=Date.now();
	

}
}