package week1;

public class SampleBlock 
{
	 SampleBlock ()
	{
		System.out.println("constructor");
	}
	 
	{
		System.out.println("Initializer Block"); //runs first when the instance is created
		String numer="now";
	}
	static 
	{
		System.out.println("Static block");       //runs before the main gets exicuted 
	}
public static void main(String args[])
{
	int a=10;
	int b=20;
//	System.out.println(+(a) +(b));
	 SampleBlock obj=new SampleBlock ();

}
}
