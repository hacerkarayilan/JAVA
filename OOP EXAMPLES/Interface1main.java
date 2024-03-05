package udemy;

import java.util.ArrayList;

public class Interface1main {

	public static void main(String[] args) {
		Interface1 a = null;

		ArrayList<Interface1>animals=new ArrayList<>();
for(int i = 0; i<10; i++) {
	if(i/2==0) 
		 a = new cat();
	
	else 
		a = new dog();
	animals.add(a);
		
	
}
for (Interface1 in1 : animals) {
	
	if (in1 instanceof cat) {
		in1.speak();
		in1.walk();
		in1.swim();
	} 
	else if (in1 instanceof dog) {
		in1.speak();
		in1.walk();
		in1.swim();
	}

}

}
	}
