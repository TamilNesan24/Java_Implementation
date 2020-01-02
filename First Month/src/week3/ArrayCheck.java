package week3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCheck {
	 public static void main(String args[]) throws ParseException
	 {
	ArrayList<Double> arr =new ArrayList();
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
		arr.add(in.nextDouble());
		}

     }while(ch!=0);
	System.out.println(arr);
}
}