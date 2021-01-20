package constructorsproject;

public class ConstructorsProject {
	
	public static void main(String[] args) throws Exception {
		Number n1, n2, n3;
		
		n1=new Number();
		n1.displayData();
		n1.setData(200);
		n1.displayData();
		System.out.println("\n");
		
		n2=new Number();
		n2.displayData();
		n2.getData();
		n2.displayData();
		System.out.println("\n");
		
		n3=new Number();
		n3.displayData();
		System.out.println("\n");
	}

}
