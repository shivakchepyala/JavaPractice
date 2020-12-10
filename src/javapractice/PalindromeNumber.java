package javapractice;

import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("Number Entered is: "+num);
		
		int orginialNum = num;
		int rev=0;
		
		// Reverse the number
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reversed Number is: "+rev);
		
		// Checking whether number is Palindrome
		if(orginialNum==rev)
		{
			System.out.println(orginialNum+" The number entered is palindrome: "+rev);
		}
		else
		{
			System.out.println(orginialNum+" The number entered is not a palindrome: "+rev);
		}
		
		sc.close();
		
	}
	
	

}
