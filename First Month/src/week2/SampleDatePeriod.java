package week2;

import java.time.LocalDate;
import java.time.Period;

public class SampleDatePeriod 
{


	public static void main(String ar[])
	{
		LocalDate n1=LocalDate.now();
		Period n=Period.ofDays(54);
		Period n2=Period.of(2017, 10, 30);
		n1=n1.minus(n2);
		System.out.println(n1);
		n1=n1.plus(n);	
		System.out.println(n1);
		n1=n1.plusDays(54);
		System.out.println(n1);
		
	}

}
