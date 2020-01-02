package week2;
class First { } 
interface SecondInterface { }  
  

public class SampleInstanceof extends First implements SecondInterface { 
 

	public static void main(String[] args)
    { 
            int a;
        First obj1 = new First(); 
        First obj2 = new SampleInstanceof(); 
        int s=10;
           
  
      
        System.out.println("obj1 instanceof First: "+ (obj1 instanceof First)); //true
        System.out.println("obj1 instanceof SampleInstanceof: "+ (obj1 instanceof SampleInstanceof)); //false
        System.out.println("obj1 instanceof SecondInterface: "+ (obj1 instanceof SecondInterface)); //false
  
        // Since obj2 is of type SecondInterface, 
        // whose parent class is First 
        // and it implements the interface Second interface 
        // it is instance of all of these classes 
        System.out.println("obj2 instanceof First: " + (obj2 instanceof First)); //true
        System.out.println("obj2 instanceof SampleInstanceof: "+ (obj2 instanceof SampleInstanceof ));//true 
        System.out.println("obj2 instanceof SecondInterface: "+ (obj2 instanceof SecondInterface)); //true
    } 
} 
  



