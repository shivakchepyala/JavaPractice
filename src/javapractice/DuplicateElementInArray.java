package javapractice;

public class DuplicateElementInArray {
	
	public static void main(String[] args) {
		
		// Approach 1
		String strValue[] = {"Java", "C", "C++", "Python", "JavaScript", "Python"};

		for(int i=0; i<strValue.length; i++)
		{
			for(int j=i+1; j<strValue.length; j++)
			{
				if(strValue[i]==strValue[j])
				{
					System.out.println("Duplicate Element in the Array is: "+strValue[i]);
				}
			}
		}
	
		
	
	
	
	
	}
	

}
