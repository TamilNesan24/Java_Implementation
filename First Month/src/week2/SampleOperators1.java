package week2;
//logical && and|| 
public class SampleOperators1 
{
	public static void main(String a[])
	{
		int num1=20;
		int num2=10;
		int add=30;  
		System.out.println(num1<num2&&num1<add); //false && true = false  checks only the first value after that goes to second
		System.out.println(num1<num2&num1<add);      //false & true = false  
		System.out.println(num1>num2||num1<add);     //true || true = true  
		System.out.println(num1>num2|num1<add);     //true | true = true  
		///
		
		System.out.println(num1>num2||num1++<add); //true || true = true  
		System.out.println(num1);                  //20 because second condition is not checked  
		System.out.println(num1>num2|num1++<add); //true | true = true  
		System.out.println(num1);                 //21 because second condition is checked  
}
}
