package chapter5;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("sat�r say�s� gir ");
int sat�rsay�s� = scan.nextInt();
for(int sat�r = 0; sat�r < sat�rsay�s�; sat�r++) {
	for(int bo�luk = 0; bo�luk < sat�rsay�s�-(sat�r+1); bo�luk++ ) {
		System.out.print(" ");
	}
	for(int y�ld�z = 0; y�ld�z < 1 + ( sat�r * 2); y�ld�z++){
		System.out.print("*");
	}
	System.out.println( );
}
	}

}
