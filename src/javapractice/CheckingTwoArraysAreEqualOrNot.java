package javapractice;

import java.util.Arrays;

public class CheckingTwoArraysAreEqualOrNot {

	public static void main(String[] args) 
	{
		int arrayOne[] = {1,2,3,4,5};
		int arrayTwo[] = {1,2,3,4,5,6};
		
		// First Approach 
//		boolean status = Arrays.equals(arrayOne, arrayTwo);
//		
//		if (status==true) 
//		{
//			System.out.println("Arrays are Equal");
//		}
//		else 
//		{
//			System.out.println("Arrays are Not Equal");
//		}
		
		
		// Second Approach
		boolean status = true;
		if(arrayOne.length==arrayTwo.length)
		{
			//System.out.println("Arrays are Equal and Current Status: "+status);
			for(int i=0;i<arrayOne.length;i++)
			{
				if(arrayOne[i]!=arrayTwo[i])
				{
					status=false;
					//System.out.println("Arrays are Not Equal and Current Status: "+status);
			
				}
			}
			
		}
		else
		{
			status = false;
			//System.out.println("Arrays are Not Equal and Current Status: "+status);
		}
		
		if(status==true)
		{
			System.out.println("Arrays are Equal and Current Status: "+status);
		}
		else
		{
			System.out.println("Arrays are Not Equal and Current Status: "+status);
		}
		

	}

}
