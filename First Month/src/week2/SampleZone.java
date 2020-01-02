package week2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class SampleZone 
{
	 public static void main(String args[]) throws ParseException
	 {
		 ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
		 ZoneId zoneid2 = ZoneId.of("Africa/Nairobi");  
		    Date in=new Date();
		    ZoneId zone = ZoneId.systemDefault();
		    ZoneId zone1 = ZoneId.systemDefault(); 
		    SimpleDateFormat format=new SimpleDateFormat("E HH-mm-ss a z");
		    SimpleDateFormat format1=new SimpleDateFormat("dd-MMM-yyyy");

		    
		    String newsave="20-Mar-2019";
		    LocalDate id1 = LocalDate.now(zoneid1);  
		    LocalDate id2 = LocalDate.now(zoneid2);  
		    LocalTime id3 = LocalTime.now(zoneid1);  
		    LocalTime id4 = LocalTime.now(zoneid2);  
		   Date two=format1.parse(newsave);
		    System.out.println(id1+"  "+id3);  
		    System.out.println(id2+"  "+id4);
		    System.out.println(two);
		    System.out.println(format.format(in));
		    ZoneId z;
//		    System.out.println(ZoneId.getAvailableZoneIds());
	 }
}
