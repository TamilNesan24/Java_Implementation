package week3;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EqualsinClass 
{
	String name;
	EqualsinClass(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println(this.name);
	}
	public static void main(String ar[]) throws CloneNotSupportedException 
	{
		EqualsinClass s= new EqualsinClass("Hi");
		EqualsinClass s1= new EqualsinClass("Hi no");
		List<Integer> te=new ArrayList();
		HashMap ob=new HashMap();
		ob.put(45, 9);
		te.add(12);
//		te.add("String");
//		Collections.sort
//		s1=s;
		s=(EqualsinClass) s1.clone();
		s1.display();
		s.display();
		System.out.println(s.equals(s1));
		String name="a";
		String name1="b";
		System.out.println(name.compareTo(name1));
//		System.out.println(s==s1);
		
//				System.out.println(s.equals(s1));
				String str=s.toString();
				String str1=s1.toString();
//			System.out.println(str.compareTo(str1));
				System.out.println(str);
//						System.out.println(str1);

	}

}
 
