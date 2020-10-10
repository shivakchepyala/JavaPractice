package javapractice;
public class Car 
{
	//Instance Variable
	String color;
	int price;
	int speed;
	
	//Class Variable
	static int tyres=4;
	
	//Default Constructor
	Car()
	{
		System.out.println("This is a Default Constructors");
		System.out.println(color+" "+price);
	}
	
	// Parameterised Constructor
	Car(String c, int p)
	{
		color=c;
		price=p;
		System.out.println("This is a Parameterised Constructors");
		System.out.println(color+" "+price);
		
	}
	
	//Display Method
	public void display(int m)
	{
		//local variable
		int model = m;
		System.out.println("Model is: "+model);
	}
	
	
	//Main Method
	public static void main(String[] args) {
		//Car object is created
		Car obj = new Car();
		Car obj1 = new Car("Black", 54);
		obj.display(45);
		
	}
	
	

}
