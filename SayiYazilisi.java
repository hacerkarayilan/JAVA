package eexercise;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir say� girin ");
int say� = scan.nextInt();
int y�zler = say� / 100;
int onlar = (say� % 100) / 10;
int birler = (say� % 100) % 10;
if (say� >= 100 && say� <= 999) {
	switch ( y�zler ) {
	case 1: System.out.print("y�z "); break;
	case 2: System.out.print("iki y�z "); break;
	case 3: System.out.print("�� y�z "); break;
	case 4: System.out.print("d�rt y�z "); break;
	case 5: System.out.print("be� y�z "); break;
	case 6: System.out.print("alt� y�z "); break;
	case 7: System.out.print("yedi y�z "); break;
	case 8: System.out.print("sekiz y�z "); break;
	case 9: System.out.print("dokuz y�z "); break;
	
	}
	if ( onlar ==1 ) {
		System.out.print("on ");
	}
	else if (onlar == 2) {
		System.out.print("yirmi ");
	}
	else if ( onlar == 3) {
		System.out.print("otuz ");
	}
	else if ( onlar == 4) {
		System.out.print("k�rk ");
	}
	else if (onlar == 5) {
		System.out.print("elli ");
	}
	else if (onlar == 6) {
		System.out.print("atm�� ");
	}
	else if ( onlar == 7) {
		System.out.print("yetmi� ");
	}
	else if ( onlar == 8) {
		System.out.print("seksen ");
	}
	else if ( onlar == 9) {
		System.out.print("doksan ");
	}
	switch (birler) {
	case 1: System.out.print("bir "); break;
	case 2: System.out.print("iki "); break;
	case 3: System.out.print("�� "); break;
	case 4: System.out.print("d�rt "); break;
	case 5: System.out.print("be� "); break;
	case 6: System.out.print("alt� "); break;
	case 7: System.out.print("yedi "); break;
	case 8: System.out.print("sekiz "); break;
	case 9: System.out.print("dokuz "); break;
	}
	}

}
}