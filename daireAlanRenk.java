package f�nal;

public class circle1 extends shape {
double radius;
	public circle1(String color, double radius) {
		super(color);
		this.radius=radius;
	}

	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return "dairenin alan�" + area() + "dairenin rengi " + super.color ;
	}

}
