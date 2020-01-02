package week2;

import java.util.Scanner;

class First1 extends RuntimeException
{
	First1(String send)
	{super(send);}
	} 
public class ExSampleExceptionUserDefine 
{
	public static void main(String args[])
	{
		
		try(Scanner in=new Scanner(System.in))
		{
			throw new First1("This is an User Define Exception");
		}
		catch(First1 take) {
			System.out.println(take+"   :added with this catch");
		}
	}
		
}
