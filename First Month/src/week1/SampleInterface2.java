package week1;
 interface C
{
	//void method2 ();
	default void method1()
	{
		System.out.println("A method");
	}
	
}
class B implements C
{
	public  void method1()
	{
		C.super.method1();
		
		System.out.println("B method");
	}
}
public class SampleInterface2 implements C 
{
	public void method1()
	{
		System.out.println("reference method");
	}

public static void main(String args[])
{
	
	 B obj =new B();
	 SampleInterface2 obj1= new SampleInterface2();
	obj.method1();
	obj1.method1();
	// The below code is to overwrite the default  method in the interface
	
          //	C obj3=new C() {
          //		public void method2()
          //		{
          //			System.out.println("interface obj method");
          //		}
          //	};
	
		
	}
	
	
}




//When the supertypes of a class or interface provide multiple default methods with the same signature:

//Instance methods are preferred over interface default methods.
//Methods that are already overridden by other candidates are ignored. 
//This circumstance can arise when supertypes share a common ancestor.