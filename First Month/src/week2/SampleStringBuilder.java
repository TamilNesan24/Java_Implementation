package week2;
//Its is not Thread Safe
public class SampleStringBuilder {
public static  void main(String args[])
	{
	String name1="Test1";
		StringBuilder name=new StringBuilder(name1);
		StringBuilder name2=name.append("today");
		name2.append("now").append("soon");
		System.out.println("name ="+name);
		System.out.println("name2 ="+name2);
		name=name.append("is done");
		System.out.println(name.insert(8,"Now"));//will be same as before
	}
	}
