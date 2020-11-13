package javapractice;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {

		// Checking the maximum element in the array
		int arrayMaxInput[] = {50,40,80,90,900};
		int max = arrayMaxInput[0];
		for(int i=1; i<arrayMaxInput.length; i++)
		{
			if(arrayMaxInput[i]>max)
			{
				max=arrayMaxInput[i];
			}
		}
		System.out.println("Maximum Element in Array is: "+max+"\n");


		// Checking the maximum element in the array
		int arrayMinInput[] = {50,400,80,90,900};
		int min = arrayMinInput[0];
		for(int i=1; i<arrayMinInput.length; i++)
		{
			if(arrayMinInput[i]<min)
			{
				min=arrayMinInput[i];
			}
		}
		System.out.println("Minimum Element in Array is: "+min);



	}

}
