package javapractice;

import java.util.Scanner;

public class PrintPattern {
	
	public static void main(String[] args) {
		/* Need to print this pattern
		 * 1
		 * 23
		 * 456
		 * 78910
		 *  
		 * */
		
		int count = 1;
		for(int i=1; i<5; i++)  //i=1 //i=2
		{
			for(int j=count;j<count+i;j++) //j=1 j<count+i==>j<2  //j=2 2<2   //j=2 j<1+2=3
			{
				
				System.out.print(j);			
				
			}
			count = count+i;
			System.out.println("");
			
		}
		System.out.println("Count Value: "+count);
	}

}
