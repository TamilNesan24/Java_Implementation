package week3;

import java.text.ParseException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;
//HashMap
//16 memory allocated
//0.75 fill capacity
//methods same as hashset
//--------------Iteration----------
//        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
//


public class Map1 {
	 public static void main(String args[]) 
	 {
	HashMap map=new HashMap<String,String[]>();
	HashMap<ArrayList,String[]> map2=new HashMap<ArrayList ,String[]>();
	String one[]={"java 14","ios new","java 13"};
	String two[]={"java 12","ios old","java 11"};
	String three[]={"java 10","ios veryold","java 9"};
	  map.put("2019",one);  
	  map.put("2018",two);  
	  map.put("2017",three); 
	  System.out.println(map.get(200));
//	  Collections.
//	  Set<String>key=map.keySet();
//	  System.out.println(key);
//	  Collection<String[]> value=map.values();
//	  System.out.println(value);
//	  String search="java 12";
//	  Iterator<String[]> itr=value.iterator();
//	  if(key.contains(search));
//	  if(value.contains(search));
//	  System.out.println(value.contains(search));
//	  int count;
//	  int hash=0;
//	  String hash1=new String();
//	  for(count=0;count<3;count++)
//	  {
//	  if(one[count].contains(search))break;
//	  if(three[count].contains(search))break;
//	  if(two[count].contains(search))
//		   hash = two.hashCode();
//	  hash1=two.toString();
//	  break;
//	  }
//	  System.out.println(hash1);
//	  for(Map.Entry m:map.entrySet())
//	  {    
//	  String name;
	  
//	       if(m.getKey().equals(search)) {
//	    	   System.out.println(m.getKey());break;}
//	    	   if(m.getValue().equals(hash1)) {
//	    		   System.out.println(m.getValue());break;
//	    	   }
//	  }
//	    	  }  
//	  while(itr.hasNext())
//	  {
//		  Map.Entry check=
//		  System.out.println()
//	      itr.next();
//	  }
	  
	  
//	  
	  
	  
	  
}
}