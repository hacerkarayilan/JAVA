package eexercise;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayı girin ");
int sayı = scan.nextInt();
int yüzler = sayı / 100;
int onlar = (sayı % 100) / 10;
int birler = (sayı % 100) % 10;
if (sayı >= 100 && sayı <= 999) {
	switch ( yüzler ) {
	case 1: System.out.print("yüz "); break;
	case 2: System.out.print("iki yüz "); break;
	case 3: System.out.print("üç yüz "); break;
	case 4: System.out.print("dört yüz "); break;
	case 5: System.out.print("beş yüz "); break;
	case 6: System.out.print("altı yüz "); break;
	case 7: System.out.print("yedi yüz "); break;
	case 8: System.out.print("sekiz yüz "); break;
	case 9: System.out.print("dokuz yüz "); break;
	
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
		System.out.print("kırk ");
	}
	else if (onlar == 5) {
		System.out.print("elli ");
	}
	else if (onlar == 6) {
		System.out.print("atmış ");
	}
	else if ( onlar == 7) {
		System.out.print("yetmiş ");
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
	case 3: System.out.print("üç "); break;
	case 4: System.out.print("dört "); break;
	case 5: System.out.print("beş "); break;
	case 6: System.out.print("altı "); break;
	case 7: System.out.print("yedi "); break;
	case 8: System.out.print("sekiz "); break;
	case 9: System.out.print("dokuz "); break;
	}
	}

}
}