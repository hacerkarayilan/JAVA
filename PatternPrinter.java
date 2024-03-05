package chapter5;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("bir sayý girin ");
		  int sayý = scan.nextInt();
		 if(sayý % 2 == 0) { // sayý çift ise
			 for( int a = 0; a < sayý; a++) {
				 for( int b = 0; b < sayý; b++) {
				if( a == b || a + b == sayý - 1 ) {
					System.out.print("x");
				}
				else {
					System.out.print("o");
				}
			 }
		     System.out.println();
			 }
		 }
		 else if(sayý % 2 == 1) { // sayý tek ise
			 for( int a = 0; a < sayý; a++) {
				 for( int b = 0; b < sayý; b++) {
				if( a == b || a + b == sayý - 1 ) {
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


