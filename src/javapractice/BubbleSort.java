package javapractice;

public class BubbleSort {
	
	public static void main(String[] args) {
		/*Given an array of random numbers, Push all the zero’s of the given array to the end
		 *  of the array. For example, if the given array is {1, 0, 2, 6, 0, 4}, 
		 *  it should be changed to {1, 2, 6, 4, 0, 0}. The order of all other elements should be the same.*/
		
		int[] numArray = {1, 0, 2, 6, 0, 4};
		
		//int newNumArray[];
		for(int i=0; i<numArray.length; i++)
		{
			System.out.println("Value at first for loop: "+numArray[i]);
			for(int j=0; j<i-1; j++)
			{
				System.out.println("Value at second for loop: "+numArray[j]);
				if(numArray[j]>numArray[j+1])
				{
					System.out.print("Value at if: "+numArray[j]+"\n");
					//System.out.print(numArray[j]+" ");
					break;
				}
				else
				{
					System.out.print("Valve at else: "+numArray[j]+"\n");
					//System.out.print(numArray[j]+" ");
				}
				System.out.println("\n");
			}
			System.out.println("\n");
		}
	}
		
}


