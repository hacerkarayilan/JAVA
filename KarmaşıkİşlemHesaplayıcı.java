package chapter6;

import java.util.Scanner;

public class ex4 {
	public static int besýlecarp(int a) {
		return a * 5;
	}
	public static int yedýýletopla(int a) {
		return a + 7;
		
	}
	public static int uccýkart(int a) {
		return a - 3;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir a sayýsý gir " );
		int a = scan.nextInt();
		System.out.println("sonuç: " + uccýkart(yedýýletopla(besýlecarp(a))));;

	}

}
