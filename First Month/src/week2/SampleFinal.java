package week2;

public class SampleFinal 
{
	 static final int num=10;
	 final int num2;
	 SampleFinal(int a)
	 {
		 num2=a;
		 }
	
	public static void main(String[] args) 
    { 
		int num1=10;
		SampleFinal obj =new SampleFinal(num1);
		System.out.println(obj.num);
		SampleFinal obj1=new SampleFinal(num1);
		System.out.println(obj1.num);

		

		
    }
}
