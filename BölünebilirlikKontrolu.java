package eexercise;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayý giriniz ");
int sayý = scan.nextInt();
if ( sayý % 2 == 0 || sayý % 3 == 0) {
	System.out.println(sayý + " dogru girdiniz ");
}
else {
	System.out.println("farklý sayý giriniz ");
}

	}

}
