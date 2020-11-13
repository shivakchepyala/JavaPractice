package javapractice;


//Implementation of Array
public class OneDArray {

	public static void main(String[] args) {
		
		// Declaring the array
		int[] productPrice = new int[6];
		
		// Assigning the values
		productPrice[0] = 289;
		productPrice[1] = 989;
		productPrice[2] = 399;
		productPrice[3] = 100;
		productPrice[4] = 444;
		productPrice[5] = 666;
		
		// Reading the array
		int totalProductPrice = 0;
		for(int readElm: productPrice)
		{
			totalProductPrice = totalProductPrice + readElm;
			System.out.println("Array Values: "+readElm);
		}
		System.out.println("Total Product cost: "+totalProductPrice);
		System.out.println("\n");
		
		// Array value update
		productPrice[4]=888;
		for (int updatedArray : productPrice) 
		{
			
			System.out.println("Updated Array Values: "+updatedArray);
		}
	}
	
}
