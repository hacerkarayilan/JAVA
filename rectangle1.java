package fýnal;

public class rectangle1 extends shape {
double width;
double length;
	public rectangle1(String color, double width, double length) {
		super(color);
		this.length=length;
		this.width=width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "dikdörtgenin alaný" + area() + "dikdörtgenin rengi " + super.color;
	}

}
