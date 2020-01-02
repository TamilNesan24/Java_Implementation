package week3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

//CheckedCollection
//Swap-----Swap(name,ar,ar)
//Fill------fill(ar,name)
public class CollectionMethod 
{
	 public static void main(String args[]) throws ParseException
	 {
		 ArrayList<Integer> array =new ArrayList<Integer>();
		 ArrayList<Integer> array2=new ArrayList<Integer>();
		 array.add(100);
		 array.add(200);
		 array.add(300);
		 array.add(400);
		 array.add(500);
		 array2.add(700);
		 array2.add(600);
Collections.swap(array2, 0, 1);
System.out.println(array2);
Collections.copy(array,array2);
System.out.println(array);
System.out.println(array2);
Collections.fill(array2,1000);
System.out.println(array2);
}
}