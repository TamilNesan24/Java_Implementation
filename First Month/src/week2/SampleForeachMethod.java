package week2;

import java.util.ArrayList;

public class SampleForeachMethod 
{
	
	 public static void main(String[] args) 
	    {
		 
	        ArrayList<Integer> Numbers = new ArrayList<Integer>(); 
	  
	        // Add Number to list 
	        Numbers.add(23); 
	        Numbers.add(32); 
	        Numbers.add(45); 
	        Numbers.add(63); 
	  
	        // forEach method of ArrayList and 
	        // print the numbers
	        // we can also use to in methods using lambda expression
	        
            //Numbers.forEach((callnumber) -> System.out.println(callnumber));
	        // using the method reference
	        Numbers.forEach(System.out::println);
	    } 

}
