package week1;
class Test24{
	static void take() {
		System.out.println("Testing");}
}
class Test
{
	int name1;
	int name() 
	{
		int name=12;
		System.out.println("Parent overload1");
		return 0;
		}
	private void check()
	{}
	
	// String name(){return "a";} //throws error because it has same name ..we can overload using return type
	
	String name2()
	{
		int one=1;
		System.out.println("Parent overload2");
		return "a";
		}
	static void test1()
	{
		int name=10;
		System.out.println("overload1 static");
	}
}

public class SamplePolymorphism extends Test 
{
	
	static void test1() 
	{
//		Test.test1();// only can be used in static reference type
	//name++;
		System.out.println("Child overload2");
	}
	int name()
	{
//		super.name1++;
//		System.out.println("child overload1");
		return 0;
			
	}
//	String name()
//	{return "hi";} not possible
	final int i=9;
	public static void main(String args[])
	{
		
//		Test24.take();
		Test obj=new SamplePolymorphism();
//		obj.name();
		Test obj3=new Test();
//		obj3.name();
		StringBuffer n=new StringBuffer("hi");
		StringBuffer n2=new StringBuffer("hi");
		n2=n;
        System.out.println(n.equals(n2));
        System.out.println(n==n2);
		SamplePolymorphism obj2=new SamplePolymorphism();
		
//		obj2.name2();
//		obj2.name();
//		obj.name2();
//		obj.name();
		
	}

}
