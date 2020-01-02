package week1;

import java.time.LocalDate;

public class TestXX {
	int add() {return 10;}
	public static void main(String a[])
	{
LocalDate date=LocalDate.now();
System.out.println(date);
int d=date.getDayOfMonth();
int m=date.getMonthValue();
int ys=date.getDayOfYear();
int y=date.getYear();
System.out.println(y);
System.out.println(m);
System.out.println(ys);
System.out.println(d);


	}
	

}
