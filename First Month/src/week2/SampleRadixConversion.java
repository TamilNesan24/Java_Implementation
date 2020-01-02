package week2;

public class SampleRadixConversion 
{
	public static void main(String ar[])
	{
		
		 // parses the string with specified radix
	      int a = Integer.parseInt("0", 10);
	      System.out.println(a);
	 
	      int b = Integer.parseInt("222", 10);
	      System.out.println(b);
	  
	      int c = Integer.parseInt("-0", 10);
	      System.out.println(c);
	   
	      int d = Integer.parseInt("-BB", 16);
	      System.out.println(d);
	   
	      int e = Integer.parseInt("1010110", 2);
	      System.out.println(e);
	   
	      int f = Integer.parseInt("2147483647", 10);
	      System.out.println(f);

	      int g = Integer.parseInt("-2147483648", 10);
	      System.out.println(g);
	   
	      int h = Integer.parseInt("ADMIN", 27);
	      System.out.println(h);
	   
	
	
	}
}
//parseInt("0", 10) returns 0
//parseInt("222", 10) returns 222
//parseInt("-0", 10) returns 0
//parseInt("-BB", 16) returns -187
//parseInt("1010110", 2) returns 86
//parseInt("2147483647", 10) returns 2147483647
//parseInt("-2147483648", 10) returns -2147483648
//parseInt("2147483648", 10) throws a NumberFormatException
//parseInt("99", 8) throws a NumberFormatException
//parseInt("Kona", 10) throws a NumberFormatException
//parseInt("ADMIN", 27) returns 5586836