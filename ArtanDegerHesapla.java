package eexercise;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir say� girin");
double say� = scan.nextDouble();
if (say� >= 90) {
	System.out.println("say� " + (say� * 3 / 100 + say�));
}
else if (say� < 90) {
	System.out.println("say� " + (say� * 1 / 100 + say�));
}
	}

}
