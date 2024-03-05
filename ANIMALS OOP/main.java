package a;

public class main {
public static void main(String[] args) {
	Pet myPet = new Pet( );
	System.out.println(myPet.speak());
	Pet myCat = new Cat( );
	System.out.println(myCat.speak());
	myCat.setName("Puff Puff");
	System.out.println(myCat.getName());
	Pet myDog = new Dog();
	System.out.println(myDog.speak());
	myDog.setName("hi");
	System.out.println(myDog.getName());
}

}
