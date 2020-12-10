package javapractice;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println("Number entered: "+num);
		
		// logic 1 - using StringBuffer class
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse value: "+rev);
		//System.out.println("Casted value: "+Integer.parseInt(rev.toString()));
		
		// logic 2 - using StringBuilder class
		/* 
		 * StringBuilder in Java represents a mutable sequence of characters.
		 * since the String class in Java created an immutable sequence of 
		 * characters, the StringBuilder class provides an alternative to 
		 * String Class, as it creates a mutable sequence of characters. 
		 * 
		 * */
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev1 = sb1.reverse();
		System.out.println("Reverse Value: "+rev1);
		
		// logic 3 
		int rev2=0;
		while(num!=0)
		{
			rev2=rev2*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Value: "+rev2);
		
		sc.close();
		
	}

}
