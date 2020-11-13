package javapractice;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		// Input Array Value
		int a[] = {1,2,3,4,6};
		int sum1 = 0;
		for(int i=0; i<a.length;i++)
		{	
			sum1 = sum1+a[i];
			System.out.println("Array of Elements: "+a[i]+" ");
		}
		System.out.println("\n"+ "Sum Of Array Of Elements: "+sum1);
		
		int sum2 = 0;
		// {1,2,3,4,5,6}
		for(int i=1; i<=6; i++)
		{
			sum2 = sum2+i;
			
		}
		System.out.println("\n"+ "Sum of range of numbers: "+sum2);
		
		int missingNumber = sum2-sum1;
		System.out.println("\n"+ "Missing Number: "+missingNumber);
	}

}
