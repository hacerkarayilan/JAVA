package week2;

import java.util.Scanner;

public class iþlem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		for(int satýr=1; satýr<=number;satýr++) {
			for(int boþluk = 0; boþluk<satýr; boþluk++)
				System.out.print(" ");
			for(int yýldýz = satýr; yýldýz<=number; yýldýz++)
				System.out.print("*" + " ");
				System.out.println();
		}
		for(int satýr=number-1; satýr>0;satýr--) {
			for(int boþluk = 0; boþluk<satýr; boþluk++)
				System.out.print(" ");
			for(int yýldýz =satýr; yýldýz<=number;yýldýz++)
				System.out.print("*" + " ");
				System.out.println();
		}
	}
}
