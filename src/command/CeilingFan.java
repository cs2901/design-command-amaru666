package command;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;

	public void high() {
		// turns the ceiling fan on to high
		speed = HIGH;
		System.out.println("Ceiling fan is on high");
	}

	public void low() {
		// turns the ceiling fan on to low
		speed = LOW;
		System.out.println("Ceiling fan is on low");
	}

	public void off() {
		// turns the ceiling fan off
		speed = OFF;
		System.out.println("Ceiling fan is off");
	}

	public int getSpeed() {
		return speed;
	}
}
