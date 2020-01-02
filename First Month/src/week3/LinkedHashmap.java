package week3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
	public static void main(String args[]){  
		   
		  LinkedHashMap<Integer,String> linkmap=new LinkedHashMap<Integer,String>();  
		  
		  linkmap.put(100,"Amit");  
		  linkmap.put(101,"Vijay");  
		  linkmap.put(102,"Rahul");  
		  
		for(Map.Entry m:linkmap.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
