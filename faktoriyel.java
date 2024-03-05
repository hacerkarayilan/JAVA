package chapter6;

import java.util.Scanner;

public class ex2 {
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý girin ");
		int sayý = scan.nextInt();
		int faktoriyel = 1;
		while( sayý > 0) {
			
			  faktoriyel =faktoriyel * sayý;
			  sayý--;
			  
			
		}
		System.out.println("faktoriyel " + faktoriyel);
	}

	public static void main(String[] args) {
		
faktoriyel();
	}

}
