package week2;

import java.util.Scanner;

public class i�lem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		for(int sat�r=1; sat�r<=number;sat�r++) {
			for(int bo�luk = 0; bo�luk<sat�r; bo�luk++)
				System.out.print(" ");
			for(int y�ld�z = sat�r; y�ld�z<=number; y�ld�z++)
				System.out.print("*" + " ");
				System.out.println();
		}
		for(int sat�r=number-1; sat�r>0;sat�r--) {
			for(int bo�luk = 0; bo�luk<sat�r; bo�luk++)
				System.out.print(" ");
			for(int y�ld�z =sat�r; y�ld�z<=number;y�ld�z++)
				System.out.print("*" + " ");
				System.out.println();
		}
	}
}
