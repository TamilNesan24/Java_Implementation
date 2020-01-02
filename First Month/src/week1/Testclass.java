package week1;
class TestX {
	public void adder() {
		System.out.println("adder");}}

class Testclass extends TestX {
	void show() {}
	public static void main(String args[]) 
	{
		System.out.println("show");
//		Testclass obj =(Testclass) new TestX();
		
		Testclass obj1=new Testclass();		
		TestX ts= new Testclass();
		System.out.println(ts+"  " +obj1);

		Integer x=9;
		Object ob=x;
		Integer x2=(Integer)ob;
		System.out.println(ob);
		System.out.println(x2);
}
}


