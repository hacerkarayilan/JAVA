package chapter6;

import java.util.Scanner;

public class ex2 {
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� girin ");
		int say� = scan.nextInt();
		int faktoriyel = 1;
		while( say� > 0) {
			
			  faktoriyel =faktoriyel * say�;
			  say�--;
			  
			
		}
		System.out.println("faktoriyel " + faktoriyel);
	}

	public static void main(String[] args) {
		
faktoriyel();
	}

}
