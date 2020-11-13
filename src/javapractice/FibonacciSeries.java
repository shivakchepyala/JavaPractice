package javapractice;

import java.util.Scanner;

/* 
 * The Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, ... 
 * (add the last two to get the next)
 * 
 */
public class FibonacciSeries {
	
	public static void main(String[] args) 
	{
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		int f1, f2=0, f3=1;
		System.out.print(f2+" ");
		for(int i=0; i<=num; i++)
		{
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		
	}

}
