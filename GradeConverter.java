package chapter6;

import java.util.Scanner;

public class ex9 {
public static void not(int skor) {
	
	if (skor >= 90 ) {
		System.out.println('A');
	}
	else if (skor >= 70) {
		System.out.println('B');
	}
	else if (skor >= 50) {
		System.out.println('C');
	}
	else {
		System.out.println('D');
	}
	
}
	public static void main(String[] args) {
		System.out.print("notunuz: "); 
		not(90);
		

	}

}
