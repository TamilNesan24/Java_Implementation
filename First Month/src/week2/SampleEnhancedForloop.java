package week2;

public class SampleEnhancedForloop 
{
	    public static void main(String args[]) 
	    { 
	    	SampleEnhancedForloop obj =new SampleEnhancedForloop();
	        String array[] = {"Ron", "Harry", "Hermoine"};
	        String array1[]= {"asume"};
	        array[2]+=array1[0];
//	        System.out.println(array[2]);
	        //iterates the value for each of the index
	        // can be only used in array or collection
	        // Only increment order no decrement order
	        for (String x:array) 
	        { 
	            System.out.println(x); 
	        } 
	  
	        /* for loop for same function 
	        for (int i = 0; i < array.length; i++) 
	        { 
	            System.out.println(array[i]); 
	        } 
	        */
	    } 
	} 
	


