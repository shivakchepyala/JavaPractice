package javapractice;
public class Account 
{
	int a;
	int b;
	
	public void setData(int a, int b)
	{
		this.a = a;
		System.out.println("Current Value of A is: "+this.a);
		this.b = b;
	}
	
	public void showData()
	{
		System.out.println("Value of A is: "+a);
		System.out.println("Value of B is: "+b+"\n");
	}
	
	public static void main(String[] args) {
		Account obj = new Account();
		obj.setData(3, 6);
		obj.showData();
		
		
		
		try {
			int x = 30;
			int y = 0;
			int z = x/y;
			System.out.println("Result of z is: "+z);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Number cannot be divided by zero");
		}*/
		finally {
			System.out.println("\n");
			System.out.println("Executed");
		}
		
		
	}

}
