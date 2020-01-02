package week2;

public class SampleForloop 
{
	public static void main(String[] args) {  
	int num1=20;
	int num2=10;
	
	//we can label the for loop for reference
	//and use it to stop the loop
	//(;;) for infinite loop in forloop
	num1:  
        for(;num1<=30;num1++){  
            num2:  
                for(;num2<=30;num2++){  
                    if(num2==15)
                        break num1;  
                    System.out.println(num1+" "+num2);  
                }  
        }  
	
// continue statement 
	
	for(int num3=1;num3<=10;num3++){  
        if(num3==5){  
            //using continue statement  
            //it will skip the rest statement
        	continue;
        }  
        System.out.println(num3);  
    }  
}
	}
