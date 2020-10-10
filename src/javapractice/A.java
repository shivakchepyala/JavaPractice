package javapractice;
public class A {
	
	A()
	{
		System.out.println("Constructor of A");
	}
	
	void AMethod() 
	{
		System.out.println("Methos of class A");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj_A = new A();
		B obj_B = new B();
		obj_A.AMethod();
		obj_B.BMethod();

	}

}
