package week2;

public class ExSampleExceptionNestedTry 
{
	public static void main(String args[])
	{
		int num=10;
		int num1=0;
		int div;
		try {
		  try{  
		   div=num/num1;  
		   System.out.println(div);  
		   
		  }  
		  catch(NullPointerException e)
		  {
			  System.out.println(e);
			  }
		  }
		catch(ArithmeticException e)
		{
			System.out.println("Catch2");
		}
}
}