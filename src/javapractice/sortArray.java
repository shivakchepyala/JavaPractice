package javapractice;

import java.util.Arrays;
import java.util.*;
import java.awt.datatransfer.*;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int numArray[] = {11, 9, 12, 56, 12, 66, 5, 45, -1};
		
		int length = numArray.length;

		for(int i=0; i<=length-1; i++)  //i=0 //Actual-> 11, 9, 12, 56, 12, 66, 5   //Excepted-> 5, 9, 11, 12, 12, 56, 66
		{
			for(int j=i+1;j<=length-1;j++) //j=1 1<=6
			{
				if(numArray[i]>numArray[j]) //11>9
				{
					int temp = 0;
					temp=numArray[i]; 
					numArray[i]=numArray[j];
					numArray[j]=temp;           
				}
			}
			System.out.print(numArray[i]+" ");
		}
		System.out.println("\n");
		
		
		// Approach 1
		int array1[] = {11, 9, 12, 56, 12, 66, 5};
		System.out.println("Array Elements before sorting: "+Arrays.toString(array1));
		Arrays.parallelSort(array1);
		System.out.println("Array Elements after sorting: "+Arrays.toString(array1)+"\n");
		
		// Approach 2
		int array2[] = {60,20,10,30,50,40};
		System.out.println("Array Elements before sorting: "+Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("Array Elements after sorting: "+Arrays.toString(array2)+"\n");
		
		// Reverse Order
		Integer array3[] = {60,20,10,30,50,40};
		System.out.println("Array Elements before sorting: "+Arrays.toString(array3));
		Arrays.sort(array3, Collections.reverseOrder());
		System.out.println("Array Elements after sorting: "+Arrays.toString(array3));

		
		
	


	}

}
