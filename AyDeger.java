package eexercise;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir y�l girin ");
int y�l = scan.nextInt();
switch (y�l % 12) {
case 1: 
	System.out.println("ocak "); break;
case 2:
	System.out.println("�ubat "); break;
case 3:
	System.out.println("mart "); break;
case 4:
	System.out.println("nisan "); break;
case 5:
	System.out.println("may�s "); break;
case 6:
	System.out.println("haziran "); break;
case 7:
	System.out.println("temmuz "); break;
case 8:
	System.out.println("a�ustos "); break;
case 9:
	System.out.println("eyl�l "); break;
case 10:
	System.out.println("ekim "); break;
case 11:
	System.out.println("kas�m "); break;
case 12:
	System.out.println("aral�k "); break;
default:
	System.out.println("yanl�� say� girdinz "); break;
	}
	}

}
