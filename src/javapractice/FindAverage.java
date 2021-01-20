package javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAverage {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int i, avg, sum=0;
		
		int[] marks;
		marks = new int[6];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(i=0; i<=5; i++)
		{
			System.out.println("Enter Marks");
			marks[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0; i<=5;i++)
		{
			sum=sum+marks[i];
		}
		
		avg=sum/6;
		System.out.println("Average Marks="+avg);
		
		
	}

}
