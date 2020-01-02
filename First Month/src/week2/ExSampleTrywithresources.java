package week2;

import java.util.Scanner;

public class ExSampleTrywithresources 
{
	public static void main(String args[])
	{
		int num,num1;
		try(Scanner in=new Scanner(System.in))
		{
			num=in.nextInt();
			num=in.nextInt();
		}
		
		// OR
		//we can use finally block instead
		
//		finally {
//			in.close();
//		}
		
	}
	
}
