package chapter5;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("sayý giriniz ");
int sayý = scan.nextInt();
int faktöriyel = 1;
while (sayý >= 1) {
	faktöriyel = faktöriyel * sayý;
	System.out.println("faktöriyel " + faktöriyel + " sayý " + sayý);
	 sayý --;
}
System.out.println("faktöriyel " + faktöriyel);
	}

}
