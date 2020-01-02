package week2;

public class ExSampleExceptionFinally 
{
	public static void main(String args[])
	{
		int num=10;
		int num1=0;
		int div;
		  try{  
		   div=num/num1;  
		   System.out.println(div);  
		  }  
		  catch(NullPointerException e)
		  {
			  System.out.println(e);
			  }
		  // Not matter the exception is handled or not finally gets exicuted
		  finally{
			  System.out.println("finally block is always executed");
			  }  
		  
		  // it will exicute only when the exception is handled
		  //i.e catch(Exception e) or catch(ArithmeticException e)
		  
		  System.out.println("Yes");  //it wont gets exicuted
		  }  
		}  

