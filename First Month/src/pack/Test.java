package pack;

public class Test {
	
	
	public static void main(String args[])
	{
		InterfaceA obj1=new ClassA();
		InterfaceA obj2=new ClassB();
	    int i=20,j=10;
	    obj1.Mult(i, j);
	    obj2.Mult(i, j);
	}

}
