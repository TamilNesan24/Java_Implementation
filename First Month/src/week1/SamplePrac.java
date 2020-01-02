package week1;

class Test33
{ 
int localvar=10;
static int statvar=10;


void meth()
{
	System.out.println("method 1");
	System.out.println(localvar + statvar);
	meth2();
	
}
static void meth2()
{
	//localvar=11; local variable not allowed
	statvar=11;
	//meth();//local method is not allowed 
	System.out.println("method  2");
	System.out.println(statvar);
}
}
public class SamplePrac extends Test33
{
	static int statvar=10;
	void meth()
	{
	   //	super.meth();  allowed
		Test33.meth2(); // calls local meth again
		//Test.localvar++;   not allowed
		localvar++;
		
		super.statvar++;// allowed but class name is prefered
		super.localvar++;
		Test33.statvar++;
		System.out.println("method  3");
		System.out.println(localvar + statvar);
		//super.meth();
	}
	static 	{
		Test33.meth2();
//		this.meth3();
		//super.meth();
		statvar++;
		//Test.localvar++; not allowed
		//super.localvar++; not allowed
		System.out.println("method4");
		System.out.println(statvar);
	}
	
public static void main(String args[])
{
	//SamplePrac obj = new SamplePrac();
	//obj.meth3();
	int arr[]= {1,2};
	StringBuffer one=new StringBuffer("test");
	System.out.println(one);
	System.out.println(one.append("now"));
	
}
}

