package week3;

import java.awt.List;
import java.security.cert.CollectionCertStoreParameters;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//    Exceptions
// NoSuchElementException
// IndexOutofBound Exception
// ConcurrentModificationException 
// ClasscastException
// IoException
// Nullpointer Exception in set


public class CollectionList 
{
	 public static void main(String args[]) throws ParseException
	 {
		 ArrayList<String> arr =new ArrayList<String>();
//		 ArrayList<String> list=new ArrayList<String>();
//		 ArrayList arr1 =new ArrayList();
//		 arr.add(123);
		 arr.add("No Name");
		 arr.add("Michael");
		 arr.add("Kevin");
		 arr.add("Marry");
		 arr.add("Tamil");
		 arr.add("Rithwik");
		 arr.add("Marry");
		 arr.add("Kevin");
		 
		 
		 Collections.sort(arr);
		 Iterator it= arr.iterator();
		 for(int check=0;check<arr.size();check++)
		 {
			 if(check<arr.size()-1&&arr.get(check)==arr.get(check+1))
			{
				
				arr.remove(check+1);
			}
//			System.out.println(check);
		 }
		 arr.forEach(System.out :: println);
		 
//		 arr.add(2);
		 
		 
//		 while(it.hasNext()) {
//			 System.out.println(it.next());
//		 }
//	 arr.remove(2);
//	 System.out.println(arr.get(3));
		 

	 }

}
