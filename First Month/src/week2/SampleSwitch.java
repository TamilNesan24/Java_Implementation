package week2;

public class SampleSwitch {
	public static void main(String[] args) {  
	  
	    int number=50;
	    int number2=90;
	    char a='1';
	    String name="hi";
	    name=name+" hello";
	    System.out.println(name);
	    //Switch is case sensitive
	    // We can also have multiple Switch case
	    //it also supports enum
	    switch(name)
	    {
	    case "hi": System.out.println("yes");
	    } 
	    
	    // switch case can have variable or value
	    switch(number)
	    {    
//	case number2: System.out.println("10"); : error:case should not have variable
	    case 10: System.out.println("10"); 
	    break;  
	    case 20: System.out.println("20");  
	    break;  
	    case 30: System.out.println("30");  
	    break;
	    case 50:
	    	switch(50)
	    	{
	    	case 50: System.out.println("50");  
		    break;
	    	}
	    	// if break is not given before any case default will implement automatically
	    	break;
	    //Default case statement  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
	}  

}
