package eexercise;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir say� giriniz ");
int say� = scan.nextInt();
if ( say� % 2 == 0 || say� % 3 == 0) {
	System.out.println(say� + " dogru girdiniz ");
}
else {
	System.out.println("farkl� say� giriniz ");
}

	}

}
