package week1;
//default and static method
interface A
{
	
	int method();
	
	//default method
	default int firstmethod() 
	{
		System.out.println("Interface Default method");
		return 0;
	}
	//static method
	static int secondmethod()
	{
		System.out.println("Interface static method");
		return 0;
	}
	
	
}
public class SampleInterface1 implements A 
{
	public int method() 
	{
	    A.secondmethod();
		//A.super.firstmethod();  it is preferred only if the method is overriden
		firstmethod();
		System.out.println("Interface method");
		return 0;
		}
	public int firstmethod()
	{
//		A.secondmethod();
		A.super.firstmethod();// here no super alone is enough because interface has no instance
		System.out.println("child Interface Default method2");
		return 0;
		
	}
	static void secondmethod() 
	{
		A.secondmethod();
		System.out.println(" Child Interface static method");
		
	}
public static void main(String args[])
{
	A obj = new SampleInterface1();
	obj.method();
	obj.firstmethod();
	A.secondmethod();
	
	
}
}
