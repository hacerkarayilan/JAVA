package f�nal;

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
		return "dikd�rtgenin alan�" + area() + "dikd�rtgenin rengi " + super.color;
	}

}
