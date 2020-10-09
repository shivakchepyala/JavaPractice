
public class Audi implements ParentCar{
	int speed = 10;
	int gear = 0;
	
	public void changeGear(int value) {
		gear = value;
		
	}
	
	public void speedUp(int increment) {
		speed=speed+increment;
	}
	
	public void applyBrakes(int decrement) {
		speed=speed-decrement;
	}
	
	public void printStates() {
		System.out.println("Speed: "+speed+" Gear: "+gear);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi A6 = new Audi();
		A6.speedUp(50);
		A6.printStates();
		A6.changeGear(4);
		A6.printStates();
	}

}
