package pack;

public class ClassA implements InterfaceA,InterfaceB 
{
	public void method() 
	{
		System.out.println("Multiple interface");	
	}
	
	

	public void Mult(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	method();
	
}
}
