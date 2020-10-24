package javapractice;
public class Exception {
	public static void main(String[] args) 
	{
		// Exception Handling Concepts
		//System.out.println("Hello World");
		try {
			String str = null;
			System.out.println("Lenth of the string: "+str.length());

		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("String value can not be string");
		}
		try {
			int a=30, b=0;
			int c=a/b;
			System.out.println("Result is: "+c);
			
		} catch (ArithmeticException e) {
			System.out.println("Can't be divided by zero");
		}

		



	}

}
