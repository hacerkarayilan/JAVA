package eexercise;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir yýl girin ");
int yýl = scan.nextInt();
boolean artýkyýl = (yýl % 4 == 0 && yýl % 100 == 0 ) || ( yýl % 400 == 0 );
System.out.println( yýl + " artýk yýl mý " + artýkyýl);

	}

}
