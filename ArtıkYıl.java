package eexercise;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir y�l girin ");
int y�l = scan.nextInt();
boolean art�ky�l = (y�l % 4 == 0 && y�l % 100 == 0 ) || ( y�l % 400 == 0 );
System.out.println( y�l + " art�k y�l m� " + art�ky�l);

	}

}
