package week1;
//contructor in abstract
abstract class Bike{ 
	int a;
	//initializer
	{
		System.out.println("bike is created by initializer");  // abstract class can have initializer
	} 
	//constructor
	   Bike(){System.out.println("bike is created");
	   }   
	   
	   abstract void run();
	   
	   void changeGear(){System.out.println("gear changed");}  
	   
private void add()
{
	System.out.println("bike is created by initializer"); }
}




public class SampleAbstract2 extends Bike

{
	SampleAbstract2()
	{
		System.out.println("bike is created by refernce");
	}
	void changeGear(){System.out.println("gear changed in the class");}  
	 void run(){System.out.println("running safely..");
	 }  
	 
		 public static void main(String args[])
		 {  
			 
			 SampleAbstract2 obj =  new SampleAbstract2();
			 Bike obj2= new SampleAbstract2();
			 obj.changeGear();
			 obj2.changeGear();
			 SampleAbstract2 obj3=new SampleAbstract2();
//			 Bike.changeGear;
//	         obj.run();  
//	         obj.changeGear();  
	 }  
		 }











// Bike(int a){System.out.println("bike is created by overlaoding"+a);};

