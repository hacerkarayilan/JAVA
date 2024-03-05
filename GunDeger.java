package eexercise;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayý giriniz ");
int sayý = scan.nextInt();
switch ( sayý ) {
case 1: System.out.println("pazartesi "); break;
case 2: System.out.println("salý "); break;
case 3: System.out.println("çarþamba"); break;
case 4: System.out.println("perþembe "); break;
case 5: System.out.println("cuma "); break;
case 6: System.out.println("cumartesi "); break;
case 7: System.out.println("pazar "); break;
default: System.out.println("yanlýþ sayý girdiniz "); break;
}
	}

}
