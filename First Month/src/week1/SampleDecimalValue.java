package week1;

import java.text.DecimalFormat;

public class SampleDecimalValue 
{
	public static void main(String arrgs[])
	{
		float fl=10.34_567f;
		double a = 123.010;
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.println(df.format(fl));
		String save=String.format("%.02f" +" Float", fl);
		System.out.println(save);
		System.out.println(df.format(a));
		String save1=String.format("%.02f " +"Double", a);
		System.out.println(save1);
		
//		double a = 123.010;
//        String sa = a.ToString("0.##"); // 123.46
//		System.out.println("%.2f" +String.format(format, args)fl);
	}

}
