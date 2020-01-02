package week2;

public class SampleTernary 
{ 
		public static void main(String[] args) 
		{ 
			int a = 20, b = 10, c = 30, result; 
			String name="he oss of the";
			System.out.println(name);
			name="";
			System.out.println("yes " +name);
			System.out.println(name);
			System.out.println(name.length());


			// result holds max of three 
			// numbers 
			result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c); // same as result = ((a > b) ? ((a > c) ? a : c ): (b > c) ? b : c); 
			System.out.println("Max of three numbers = "
							+ result); 
			//another example of multiple ternary 
			
		} 
	} 



