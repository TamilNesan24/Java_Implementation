package week2;

public class StringMethods 
{
	public static void main(String[] args) 
	{ 
		
		String s1="Hello";
		String s2=new String("Hello");
		String s3="hi";
		 System.out.println(s1.concat(s2));
		 System.out.println(s1.compareTo(s2));
		 System.out.println(s1.endsWith("o"));
		 System.out.println(s1.equalsIgnoreCase(s2));
		 System.out.println(s1.indexOf("e"));
		 String s4=s3.intern();
		 s3="hello";
		 System.out.println(s4+" now "+s1);
		 System.out.println(s1.lastIndexOf("l",2));//2
		 System.out.println(s1.lastIndexOf("l"));//3
		 System.out.println(s1.replace("L","K"));//case sensitive
		 System.out.println(s1.replace("l","k"));
		 System.out.println(s1.substring(2,4));//ll
		 System.out.println(s1.toLowerCase());
		 String s5="  Hi  ";
		 System.out.println(s5.trim());
		 
		 

		 
	}
}
