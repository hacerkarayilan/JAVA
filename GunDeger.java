package eexercise;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir say� giriniz ");
int say� = scan.nextInt();
switch ( say� ) {
case 1: System.out.println("pazartesi "); break;
case 2: System.out.println("sal� "); break;
case 3: System.out.println("�ar�amba"); break;
case 4: System.out.println("per�embe "); break;
case 5: System.out.println("cuma "); break;
case 6: System.out.println("cumartesi "); break;
case 7: System.out.println("pazar "); break;
default: System.out.println("yanl�� say� girdiniz "); break;
}
	}

}
