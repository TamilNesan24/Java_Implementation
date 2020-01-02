package week2;
//StringBuffer is  Thread safe
public class SampleStringBuffer 
{
	public static void main(String args[])
{
		char arr[]= {'a','b','c','d'};
		String test=new String(arr);
	StringBuffer name=new StringBuffer(test);
	System.out.println(name.hashCode());
	name=name.append("is done");
	System.out.println(name.insert(8, "Now"));//will be same as before
	int a=10;
//	String s=
}
}