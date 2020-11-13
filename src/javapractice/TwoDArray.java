package javapractice;

public class TwoDArray {

	public static void main(String[] args) {
		
		// Declaration 
		int[][] twoDimensional= {
								{101, 102},
								{201, 201},
								{301, 302}
						};
		System.out.println("Length of the array: "+twoDimensional.length);
		
		// Read the array
		for(int i=0; i<twoDimensional.length;i++) {
			for(int j=0; j<twoDimensional[i].length; j++)
			{
				System.out.print(twoDimensional[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		// Update the array
		twoDimensional[1][1]=999;
		
		// Read the array
		for(int i=0; i<twoDimensional.length;i++) {
			for(int j=0; j<twoDimensional[i].length; j++)
			{
				System.out.print(twoDimensional[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		
		int[][] a = {
						{1, 1, 1},
						{1, 1, 1},
						{1, 1, 1}
					};
		
		int[][] b = {
						{2, 2, 2}, 
						{2, 2, 2}, 
						{2, 2, 2}
					};
		
		int[][] c = new int[3][3];
		
		// Adding
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		// Reading the array
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
