package week3;

import java.text.ParseException;
import java.util.*;

// methods
// add First
// add Last
// get ,remove --first and last as same as add method
public class LinkedList1 
{
	public static void main(String args[]) throws ParseException
	 {
		
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(null);
		list.set(0, 40);//replace the value at index 0 to 40
		list.add(0, 40);//add the element at the index 0
		list.addFirst(50);
		System.out.println(list);
	 }
}
