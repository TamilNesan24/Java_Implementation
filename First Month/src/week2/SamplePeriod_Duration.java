package week2;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class SamplePeriod_Duration
{
	public static void main(String[] args) {
		
		        //Calculate Birth Day using Period class
		
		        LocalDate localDate = LocalDate.now();
		
		        LocalDate bDay = LocalDate.of(1980, Month.OCTOBER, 12);
		
		        Period age = Period.between(localDate, bDay);
//		        Duration duration1 = Duration.between(localDate,bDay);
//		        System.out.println("Time Duration : "+duration1);
		
		        System.out.println("Current Age : "+age);

		 
		
		        //Calculate time different using Duration class
		
		        Instant instant1 = Instant.now();
		
		        Instant instant2 = instant1.plusSeconds(3600);
		
		        Duration duration = Duration.between(instant1, instant2);
		
		        System.out.println("Time Duration : "+duration);
		
		    }
		
} 
		
		
