package week1;
//System.out.println(((Test1)obj).name);//((Child)par).value
// this function used to call the local variable of the parent without creating an object
class Test1
{
	 int name=10;
	 static int nm=111;
	 int new1=12;
}
public class SampleInstance extends Test1 
{
   int name=20;
   static int nm=22;
void one()
{
	super.new1++;
	//Test1.new1; only ca use in static method
super.name++;
System.out.println(super.name);
}
public static void main(String args[])
{
	SampleInstance obj = new SampleInstance ();
	Test1 t=new Test1();
   int i= obj.name;
   int j=t.name;
   obj.one();
	System.out.println(t.name);
	System.out.println(((Test1)obj).name);//((par)Child).value
	System.out.println("Local var "+obj.name +" /Parent local variable " +((Test1)obj).name+" /Parent stat var " +Test1.nm +" /Child stat var " +nm);
	
	
}
}


