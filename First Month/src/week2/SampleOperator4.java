package week2;

public class SampleOperator4 
{
	  public static void main(String[] args) 
	    { 
		  int a = 5; 
	        int b = 7; 
	        System.out.println("~a = " + ~a); //~ it changes 0 to 1 and viceversa
	     
	        System.out.println("a<<2 = " + (a << 2)); 
	  
	        // right shift operator 
	        // 0000 0101 >> 2 =0000 0001(1) 
	        // similar to 5/(2^2) 
	        System.out.println("b>>2 = " + (b >> 2)); 
	  
	        // unsigned right shift operator 
	        System.out.println("b>>>2 = " + (b >>> 2)); 
	  
	    }
}
