package javapractice;

public class Swapping2Numbers 
{
	public static void main(String[] args) 
	{
		int a=10, b=20;
		System.out.println("Before Swapping values are: "+a+" "+b);
		
		
		// logic
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping values are: "+a+" "+b);
	}

}
