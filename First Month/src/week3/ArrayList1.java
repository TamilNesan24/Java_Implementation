package week3;

import java.text.ParseException;
import java.util.*;

public class ArrayList1 {
// Default size is 10
	 public static void main(String args[]) throws ParseException
	 {
	ArrayList arr =new ArrayList();
//	 ArrayList<String> list=new ArrayList<String>();
//	 ArrayList arr1 =new ArrayList();
	Scanner in=new Scanner(System.in);
	int ch;
//	int num=in.nextInt();
	
	do {
		System.out.println("Press 1 to enter number press 0 to exit:");
		ch=in.nextInt();
		if(ch!=0)
		{
		System.out.println("Enter number");
		arr.add(in.nextLong());
		}

      }while(ch!=0);
//	 arr.add("No Name");
//	 arr.add("Michael");
//	 arr.add("Kevin");
//	 arr.add("Tamil");
//	 arr.add("Rithwik");
//	 arr.add("Marry");
//	 arr.add("Kevin");
	
	 int i=123;
//arr.removeIf(i==123,1);
System.out.println(arr);
}
}