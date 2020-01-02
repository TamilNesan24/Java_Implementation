package week2;

public class SampleEquals {
	int a=5;
	SampleEquals(String name)
	{
		System.out.println(name);
	}
	    public static void main(String[] args) 
	    { 
	    	
	    	SampleEquals s1 = new SampleEquals("HELLO"); 
	        SampleEquals s2 = new SampleEquals("HELLO");
	       
	        //SampleEquals s3=s1;
	        
	        System.out.println(s1 == s2); //false sees contant
	        System.out.println(s1.equals(s2)); //false sees contant
	        
            // In string it behave Differently	
	        
	        String s3=new String("HELLO");
	        String s4=new String("HELLO");
	        
//            String s5=s3;  true and on both equals operator
	        
                System.out.println(s3 == s4); //refernce
      	        System.out.println(s3.equals(s4));//contant
      	       
	    } 
	} 


