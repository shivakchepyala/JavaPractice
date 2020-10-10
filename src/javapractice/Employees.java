package javapractice;

//Demo for encapsulation concept
public class Employees {
	
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp = new Employees();
		emp.setName("Shiva");
		System.out.println("Name: "+emp.getName());

	}

}
