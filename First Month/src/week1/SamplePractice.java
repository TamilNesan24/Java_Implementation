package week1;

public class SamplePractice 
{
	int num=10;
	static int one;
/*	publicp*//*protected*/ final int name2;

{
	name2=10;
	String i="k";
	System.out.println("init block");
	}
	public int name()
	{
		System.out.println(num);
		int j=9;
		int k;
//		int sum=j+k;
		System.out.println("method1");
		return 0;
		}
	int any=10;
	// In java, Method Overloading is not possible by changing the return type of the method only.

	//	public String name()
//	{return "a";}
	
//	The above code shows error
	
	//The below si the best way to do it
	public String name(int any)
	{
		int onne;
//		static int name1;    no local variable can have accsess specifier except final
//		                     only class variable can have access specifier
		final int name;
		System.out.println("method2");
		return "";
	
	}
	static
	{
		int name=10;
		int two;
		System.out.println("static block");
	}
	public static void main(String args[])
	{
		SamplePractice s;
		s=new SamplePractice();
		s.name();
		s.name(10);	
		String name=null;
//		int n,int b; its not allowed
		}
}

