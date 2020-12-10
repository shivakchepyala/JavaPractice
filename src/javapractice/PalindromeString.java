package javapractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string value: ");
		
		String str=sc.next();
		int strLength=str.length();
		System.out.println(strLength);
		String orginialStr=str;
		String revStr=" ";
		
		for(int i=strLength-1; i>=0; i--)
		{
			revStr=revStr+str.charAt(i);
		}
		
		System.out.println("Reversed String: "+revStr);
		
		if(orginialStr.equals(revStr))
		{
			System.out.println(orginialStr+" is a palindrome string"+revStr);
		}
		else
		{
			System.out.println(orginialStr+" is not a palindrome string"+revStr);
		}
		
		
		sc.close();
		
	}

}
