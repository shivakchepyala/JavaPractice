package javapractice;

public class ReverseString {

	public static void main(String[] args) 
	{
		String inputStr = "ABCD";
		int inputStrLength = inputStr.length();
		String revStr = " ";
		
		// logic 1 - using + (String Concatenation) operator
		/*for(int i=inputStrLength-1; i>=0; i--)
		{
			revStr=revStr+inputStr.charAt(i);
		}
		System.out.println("Reversed String is: "+revStr);*/
		
		// logic 2 - using character array
		/*char a[]=inputStr.toCharArray();
		for(int i=inputStrLength-1; i>=0; i--)
		{
			revStr=revStr+a[i];
		}
		System.out.println("Reversed String is: "+revStr);*/
		
		// logic 3 - using StringBuffer class
		StringBuffer sb = new StringBuffer(inputStr);
		StringBuffer revStrsb=sb.reverse();
		System.out.println("Reversed String is: "+revStrsb);
		
	}

}
