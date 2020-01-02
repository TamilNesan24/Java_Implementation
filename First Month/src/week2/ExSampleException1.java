package week2;

public class ExSampleException1 
{
	 public static void main(String args[])
	 {
		 int num=80;
		 int num1=0;
		 int data;
		 int array[]=new int[4];
	 try{  
	      //code that may raise exception  

		 data=num/num1;
	      // the below code wont exicute since it jump to the catch statement
		 
	      for(int index=0;index<=4;index++)
	      {
	    	  array[index]=index;
	      }
	   }
	 // Exception e catch should be present only at the last or else it will show error
    //	 i.e: catch(Exception e){}
	   catch(ArithmeticException n)
	   {
		   System.out.println(n+"occurs");
	   }  
	 // cant have more that same catch argument of same
//	 catch(ArithmeticException e)
//	   {
//		   System.out.println(e+"occurs");
//	   }  
	 
	 catch(Exception e)
	 {
		  System.out.println(e);
	 }
	 
	 System.out.println("runs");
}
}