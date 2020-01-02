package week2;

public class SampleString 
{
//	static final int name=10;
	public static void main(String args[])
	{
		String name="Test";
		String name2="Test";
		String name3=new String("Test1");
		String name4=new String("Test1");
	
		
		System.out.println(name==name2);
		System.out.println(name==name3);
		System.out.println(name2==name3);
		System.out.println(name4==name3);

		System.out.println(name.equals(name2));
		System.out.println(name3.hashCode());
		System.out.println(name.hashCode());
		name+="Yes";// + concat it comes under the stringbuffer method
		System.out.println(name.hashCode());

		
		
		




		
	}
}
