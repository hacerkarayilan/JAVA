package chapter5;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("bir say� girin ");
		  int say� = scan.nextInt();
		 if(say� % 2 == 0) { // say� �ift ise
			 for( int a = 0; a < say�; a++) {
				 for( int b = 0; b < say�; b++) {
				if( a == b || a + b == say� - 1 ) {
					System.out.print("x");
				}
				else {
					System.out.print("o");
				}
			 }
		     System.out.println();
			 }
		 }
		 else if(say� % 2 == 1) { // say� tek ise
			 for( int a = 0; a < say�; a++) {
				 for( int b = 0; b < say�; b++) {
				if( a == b || a + b == say� - 1 ) {
					System.out.print("x");
				}
				else {
					System.out.print("o");
				}
			 }
		     System.out.println();
			 }
		 }
		 }
	}


