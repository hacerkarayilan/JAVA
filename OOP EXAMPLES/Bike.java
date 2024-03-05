package udemy;

public class Bike implements vehicle {
public int speed;
public int gear;
	@Override
	public void changeGear(int newgear) {

gear = newgear;
	}

	@Override
	public void speedUp(int increment) {

speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decremant) {
		
		speed = speed - decremant;
	}
public void printStates() {
	System.out.println("speed " + speed + " gear " + gear);
}
}
