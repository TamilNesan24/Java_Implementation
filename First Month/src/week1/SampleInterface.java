package week1;
interface printable
{  
	int testing=10; // must have intitialization by default compiler adds  public, static and final ;
	
    void print();   // by default it is public and abstract.ie..public abstract void print();
}  

public class SampleInterface implements printable
{  
	int testing=11;
public void print()
{
	
	System.out.println("Hello");
	System.out.println("Variable: "+printable.testing +"  " +testing);
	}  
  public static void main(String args[])
{  
SampleInterface obj = new SampleInterface();  
obj.print();  
 }  
}  
