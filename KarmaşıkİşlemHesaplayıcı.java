package chapter6;

import java.util.Scanner;

public class ex4 {
	public static int bes�lecarp(int a) {
		return a * 5;
	}
	public static int yed��letopla(int a) {
		return a + 7;
		
	}
	public static int ucc�kart(int a) {
		return a - 3;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir a say�s� gir " );
		int a = scan.nextInt();
		System.out.println("sonu�: " + ucc�kart(yed��letopla(bes�lecarp(a))));;

	}

}
