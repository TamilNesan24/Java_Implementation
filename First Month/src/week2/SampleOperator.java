package week2;

public class SampleOperator 
{
public static void main(String a[])
{
	int num1=10;
	int num2=20;
	String name="hi";
	//  + is used to concat the String
    name=name+" hello";
    System.out.println(name);
//	If we write something before doing addition, then string addition takes place,
//	that is associativity of addition is left to right and hence integers are added to a string first producing a string,
//	and string objects concatenate when using +, therefore it can create below one
	System.out.println(+num1 +num2);
	System.out.println(""+num1 +num2);
	
	System.out.println(num1++);//print 10 and the increments to 11
	System.out.println(++num1);//print 12..increments before print
	int add;
	
	// precedence rules for arithmetic operators. 
    // (* = / = %) and after (+ = -) 
	
	add=num1+num2;  //adds(ans:30)
	add=num2-num1;  //subract the number(ans:10)
	add=num2*num1;  //multiply the num
	add=num2%num1;  //modulos(ans:0)..reminder
	add=num2/num1;  //divison(ans:2)..quoteint
	System.out.println(add);
	

	
	}
}
