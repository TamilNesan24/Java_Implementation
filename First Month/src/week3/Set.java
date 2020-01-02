package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Set 
{
	public static void main(String arg[])
	{
		TreeSet tree=new TreeSet();
		HashSet now=new HashSet();
		tree.add("Mick");
		tree.add("Mick");
		tree.add("B");
		now.add("A");
		System.out.println(now.add("A"));
		ArrayList list=new ArrayList(tree);
		System.out.print(tree);
		System.out.print(list);
		HashMap s=new HashMap();
		s.put(101,"tamil");
		s.put(102,"tee");
		s.put(101,"raj");
		System.out.println(s.put(101,"raj2"));

	}

}
