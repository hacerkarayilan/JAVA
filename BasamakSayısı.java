package eexercise;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir say� girin ");
int say� = scan.nextInt();
if ( say� <10 ) {
	System.out.println("say� tek basamakl� ");
}
else if (say� < 100) {
	System.out.println("say� iki basamakl� ");
}
else if (say� < 1000) {
	System.out.println("say� �� basamakl� ");
}
else if (say� < 10000) {
	System.out.println("say� d�rt basamakl� ");
}
else if (say� < 100000) {
	System.out.println("say� be� basamakl� ");
}
else {
	System.out.println("yanl�� aral�kta say� girdiniz ");
}
	}

}
