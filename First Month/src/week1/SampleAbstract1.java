package week1;
//With static method
abstract class newone 
{
	static int name=0;
	final int nextname=0;
	int name2=0;
	public static int name3=1;

static {                     
	//name2=2; will pop error                

	System.out.println("static block" +name);   // abstract class can have Static block
	name++;
}
	
static void firstmethod()
{
	name++;
	System.out.println("static method" +name);
	name++;
	
}

public void nonab() 
{
	name2++;
	System.out.println("method with body" +name2);
	
}

abstract void secondmethod();

}

public class SampleAbstract1 extends newone
{
	static {
		System.out.println("static block reference"+name);//cant use instance variable
	}

	static void firstmethod()
	{
		newone.firstmethod();
		System.out.println("static method reference"+name);
	}
	public void nonab()
	{
		super.nonab();
		//newone.nonab(); not allowed because the nonab is nonstatic
		     name2++;//using instance variable
			System.out.println("child abstract method "  +name2);
	 }
	
	public void secondmethod() {};
	public static void main(String args[])
	{
		newone obj = new SampleAbstract1();//SampleAbstract1 obj1 = new SampleAbstract1();	
		newone.firstmethod();//calling static method from abstract class
		
		
		SampleAbstract1.firstmethod();//calling static method from child class
		
		newone.firstmethod(); 
		obj.secondmethod();//method called from child class.
		obj.nonab();		

		////		obj1.secondmethod();
////		obj1.nonab();
//		newone.firstmethod(); 
	}

}












//Static method with return type 

//static int firstmethod1() {
//	return 10;
//
//}

//public void nonab() 
//{
//	name2++;
//	System.out.println("method with body reference" +name2);
//	
//}

