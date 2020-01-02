package week1;

public class SampleAccessSpecifier 
{
 void method()
{
	 System.out.println("Default");
	}
public void method1()//access to all the class outside the package also
{
	System.out.println("Public");
	}
private void method2()//access to the class alone not even within package
{
	System.out.println("Private");
	}
protected void method3()//access to all the class outside the package also only if its been extended
{
	System.out.println("Protected");
	}
}

