package week1;
// Constructor and initializer 

 class Calling {
	 
	 static int name=10;
	 final int next;
	{
		name++;
		System.out.println("Initializer block " +name);//runs before constructor
	}
//	Calling()
//	{
//		this(name);
//		name++;
//		System.out.println("Constructor " +name);
//	}
	Calling(int a)
	{ 
		name++;
		System.out.println("Overloaded Constructor "+name);
		next=a;
		System.out.println("Final var is :" +next);
	}

}
class SampleConstructor 
{
	SampleConstructor()
	{
//		this();
		super();
		System.out.println("Constructor  child "+ ""+ ""+ "");
	}
	public static void main(String args[])
	{
		Calling obj = new Calling(10);
		//Calling obj1 = new Calling(10);
		SampleConstructor  obj2= new SampleConstructor ();
		
	}
}
