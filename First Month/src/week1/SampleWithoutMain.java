package week1;
class inherit1 
{
	int name;
	static int i;
static 
{
	i++;
	System.out.println("parent Method  : static variable " +i);
	System.exit(0);
}	
}

public class SampleWithoutMain extends inherit1
{
	static 
	{ 
		//name++;
		i++;
		System.out.println("no need of Main Method : static variable" +i);
		
		//System.exit(0);
	}
	static void newmethod()
	{
		int var;
		System.out.println("no need of Main Method : static variable");
	}
	
	public static void main(String args[])
	{
		i++;
		System.out.println("no need of Main Method : static variable" +i);
		newmethod();
		//SampleWithoutMain.newmethod();
	}
//	SampleWithoutMain.main(args[]);
//	SampleWithoutMain.newmethod();

}
