package week2;
class Bike{  
	void run() {
		  System.out.println("p run");//90  

	}
	void add() {
		
		  System.out.println("p add");//90  

	}
	public static void first() {
//		void newmeth() {}

	}
	 int speedlimit=90;  
	}  
public class SampleRuntimePolymorphism extends Bike
{
	int speedlimit=150;  
	void run() {
		  System.out.println("c run");//90  

	}
	void add1() {
		  System.out.println("c add");//90  

	}
	  
	 public static void main(String args[])
	 {  
		 	 
	  Bike obj=new SampleRuntimePolymorphism();
	  SampleRuntimePolymorphism obj1=new SampleRuntimePolymorphism();
	  Bike obj2=new Bike();		
	  //Since the obj is the reference of the parent and its not overridden 
	  //if overriden its value will be changed
      System.out.println(obj.speedlimit);//90
      System.out.println(obj1.speedlimit);//150
	  obj2.run();//p
	  obj2.add();//p
	  obj1.run();//c
	  obj1.add();//p
	  obj.run();
	  obj.add();   
	  //obj.add1(); wont call
	}  

}
