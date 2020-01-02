package week1;

public class SampleClassMember 
{
	// instance variable
	int name;
	//Static variable
	static int name1;
	//method
	void newmethod()
	{
		name++;
		name1++;
		System.out.println("instance var:  " +name + " static var: "+ name1);
		}
public static void main(String args[])
{
	int local=1;//local variable
	System.out.println("local var: " +local);
	SampleClassMember obj = new SampleClassMember();
	SampleClassMember obj1 = new SampleClassMember();
	obj.newmethod();
	
	obj1.newmethod();
	}
}

