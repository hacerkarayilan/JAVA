package chapter5;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("say� giriniz ");
int say� = scan.nextInt();
int fakt�riyel = 1;
while (say� >= 1) {
	fakt�riyel = fakt�riyel * say�;
	System.out.println("fakt�riyel " + fakt�riyel + " say� " + say�);
	 say� --;
}
System.out.println("fakt�riyel " + fakt�riyel);
	}

}
