package javapractice;

public class Swapping2Numbers 
{
	public static void main(String[] args) 
	{
		int a=10, b=20;
		System.out.println("Before Swapping values are: "+a+" "+b);
		
		
		// logic 1 - using the temporary variable
		int temp =a;
		a=b;
		b=temp;
		
		// logic 2 - using +, - 
		/*a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20*/
		
		// logic 3 - using *, /
		/*a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20*/
		
		// logic 4 
		//b=a+b-(a=b);
		
		// logic 5 - bitwise XOR (^)
		/*a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20*/
		
		System.out.println("After Swapping values are: "+a+" "+b);
	}

}
