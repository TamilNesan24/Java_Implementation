package week2;

import java.time.LocalTime;

public class SampleTime 
{
	public static void main(String ar[])
	{
	LocalTime time=LocalTime.now();
	System.out.println(time);
	int t=time.getHour();
	int m=time.getMinute();
	int sec=time.getSecond();
	System.out.println(t);
	System.out.println(m);
	System.out.println(sec);
}
}