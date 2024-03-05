package eexercise;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayı girin");
double sayı = scan.nextDouble();
if (sayı >= 90) {
	System.out.println("sayı " + (sayı * 3 / 100 + sayı));
}
else if (sayı < 90) {
	System.out.println("sayı " + (sayı * 1 / 100 + sayı));
}
	}

}
