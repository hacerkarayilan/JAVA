package eexercise;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("ilk vizeyi girin");
int vize1 = scan.nextInt();
System.out.println("ikinci vizeyi girin");
int vize2 = scan.nextInt();
System.out.println("odevi girin");
int �dev = scan.nextInt();
System.out.println("quizi girin");
int quiz = scan.nextInt();
System.out.println("f�nali girin");
int f�nal = scan.nextInt();
double sonu� = ( vize1*15/100 + vize2*15/100 + �dev*20/100 + quiz*10/100 + f�nal*40/100);
System.out.println("sonu� " + sonu�);
	}

}
