package week2;

public class WrSampleInteger 
{
	public static void main(String[] args) 
    { 
		int num=100;
		Integer num1=new Integer(100);
		Integer num2=new Integer(100);
		
//		System.out.println(num==num1);
//		System.out.println(num1==num2);
//		System.out.println(num==num2);
		System.out.println(num2.hashCode());
		System.out.println(num1.toString());
		String s1="89.1"; 
		String s2="89";
		Float f1=Float.valueOf(s1);
		int num12=Integer.parseInt(s2);
		char a=(char)num;
		System.out.println(num12);
		
		 num1 = Integer.parseUnsignedInt("420",10);  
		 System.out.println(num1);
		
		//
		//  Methods
		//  
		 }
}
