
public class BMW implements ParentCar{	
	int speed = 10;
	int gear = 0;
	
	public void changeGear(int value) {
		gear = value+1;
		
	}
	
	public void speedUp(int increment) {
		speed=(speed*2)+increment;
	}
	
	public void applyBrakes(int decrement) {
		speed=(speed*4)-decrement;
	}
	
	public void printStates() {
		System.out.println("Speed: "+speed+" Gear: "+gear);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW B = new BMW();
		B.changeGear(3);
		B.printStates();
		B.speedUp(20);
		B.printStates();
		B.applyBrakes(30);
		B.printStates();
	}

	

}
