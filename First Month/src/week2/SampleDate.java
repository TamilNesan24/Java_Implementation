package week2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SampleDate extends java.util.Date {
	public static void main(String[] args) throws Exception {
		Date d1 = new Date();
		Date d2 = new Date();
		System.out.println(d1);
		LocalDate l1 = LocalDate.now();
		LocalDate l3 = LocalDate.of(2019, 11, 30);
		LocalDate l4 = l3.plusDays(4);

		System.out.println(l4 + "this");
		System.out.println(l1);
		String n = "11/30/2019";
		SimpleDateFormat s1 = new SimpleDateFormat("MM/dd/YYYY");
//String n1=s1.format(l1);
		d1 = s1.parse(n);
		String n2 = s1.format(d1);
		System.out.println(d1);
		System.out.println(n2);

	}
}
