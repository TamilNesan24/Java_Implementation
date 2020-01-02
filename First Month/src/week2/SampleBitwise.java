package week2;

public class SampleBitwise
{
	 public static void main(String[] args) 
	    {  int a = 5; 
        int b = 7; 
        System.out.println(a+""+b);
        //to find the binary of the integer
        System.out.println("Binary of "+a +" is :  " +Integer.toBinaryString(a) +"&  Binary of "+b +"is :  "+ Integer.toBinaryString(a));
        // bitwise and 
        // 0101 & 0111=0101 
        System.out.println("AND :a&b = " + (a & b)); 
  
        // bitwise or
        // 0101 | 0111=0111 
        System.out.println("OR: a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 
        System.out.println("XOR :a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
        System.out.println("~a = " + ~a); 
  
        // can also be combined with assignment operators
        a &= b; 
        System.out.println("a= " + a); 
    } 
} 


