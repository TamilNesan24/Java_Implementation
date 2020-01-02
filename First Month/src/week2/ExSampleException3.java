package week2;

public class ExSampleException3 
{
	int data;
	int num1=10;
	int num2=5;
	 void meth1()
	 {
		
		 try 
	 {
			 data=num1/0;  
			 throw new ArithmeticException("no");
	 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("yes");
		 }
		 finally {System.out.println("yes 2");}
	 }
	 void meth2()
	 {
		 try 
		 {
			meth1();
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println("yes1");
		 }
		 finally {System.out.println("yes 1");}

	 }

	 public static void main(String args[]){ 
		 int data;
		 int num1=10;
		 int num2=1;
		 new ExSampleException3().meth2();

		
}
}