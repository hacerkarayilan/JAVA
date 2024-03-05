package udemy;

public class dog implements Interface1{

	@Override
	public void speak() {
		System.out.println("dog speak ");
	}

	@Override
	public void walk() {
		System.out.println("dog walk ");
	}

	@Override
	public void swim() {
		System.out.println("dog swim ");
	}

}
