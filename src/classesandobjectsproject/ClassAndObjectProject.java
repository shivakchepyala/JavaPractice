package classesandobjectsproject;

public class ClassAndObjectProject {
	
	public static void main(String[] args) throws Exception {
		Rectangle r1, r2, r3;
		
		r1=new Rectangle();
		r2=new Rectangle();
		r3=new Rectangle();
		
		r1.setData(10, 20);
		r1.displayData();
		r1.areaPeri();
		System.out.println("\n");
		
		r2.setData(5, 8);
		r2.displayData();
		r2.areaPeri();
		System.out.println("\n");
		
		
		r3.getData();
		r3.displayData();
		r3.areaPeri();
		System.out.println("\n");
		
	}

}
