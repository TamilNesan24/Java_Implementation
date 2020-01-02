package week1;

import java.text.DecimalFormat;

public class ZSamplePractice 
{
	int a,b=10;
	void newmeth()
	{
		int c=10;
		a=c+b;
		meth(this);
	}
	void meth(ZSamplePractice S) 
	{
		a++;
		System.out.println(a);
		System.out.println("obj of this");
		//newmeth();
	}
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[0]);
		int a=10;
		int b=20;
		int min;
		min=(a<b)?a:b;  
		System.out.println(min);  
//		ZSamplePractice obj = new ZSamplePractice();
//	obj.meth(obj);
//		// obj.meth(this); // this can be used only outside the main()
//	 obj.newmeth();
//		System.out.println(obj.a);
//		//new ZSamplePractice();
//		new ZSamplePractice().newmeth();//anonymous object
	}

}
