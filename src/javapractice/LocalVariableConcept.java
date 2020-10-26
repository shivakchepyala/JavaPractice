package javapractice;

public class LocalVariableConcept {
	
	public void myAge() {
		int age=0;
		age=age+20;
		System.out.println("Current age is: "+age);
	}
	
	public static void main(String[] args) {
		LocalVariableConcept lvc = new LocalVariableConcept();
		lvc.myAge();
	}

}

