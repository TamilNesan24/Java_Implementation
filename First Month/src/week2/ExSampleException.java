package week2;

public class ExSampleException 
{
	 public static void main(String args[]){ 
		 int data;
		 int num1=10;
		 int num2=0;
		   try{  
		      //code that may raise exception
			   data=num1+num2;
			   System.out.println("rest of the code..." +"Addition is  "+data);  
		      data=num1/num2;
		      if(data<100)
//		      throw new ArithmeticException();
		      System.out.println("rest of the code..." +"Division is  "+data);
		      try {}
		      finally {}
		      
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println("Yes no");
//			   e.getStackTrace();
			   e.printStackTrace();
			   System.out.println(e);//same as e.tostring();
			   System.out.println(e.getMessage());
			   
			   
		   }  
		   finally { 
			   data=num1-num2;
		   System.out.println("rest of the code..." +"subraction is  "+data);  
		  }}
}
