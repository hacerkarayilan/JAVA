package chapter5;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("satýr sayýsý gir ");
int satýrsayýsý = scan.nextInt();
for(int satýr = 0; satýr < satýrsayýsý; satýr++) {
	for(int boþluk = 0; boþluk < satýrsayýsý-(satýr+1); boþluk++ ) {
		System.out.print(" ");
	}
	for(int yýldýz = 0; yýldýz < 1 + ( satýr * 2); yýldýz++){
		System.out.print("*");
	}
	System.out.println( );
}
	}

}
