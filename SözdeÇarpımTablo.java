package vize2;

import java.util.Scanner;

public class ex5 {
public static double toplama(double x, double y) {
	return x+y;
}
public static double ��karma(double x, double y) {
	return x-y;

}
public static double �arpma(double x, double y) {
	return x*y;
}
public static double b�lme(double x, double y) {
	return x/y;
	
}
	public static void main(String[] args) {
		System.out.println("----------------");
		System.out.println("toplama 1");
		System.out.println("��karma 2");
		System.out.println("�arpma 3");
		System.out.println("b�lme 4");
		System.out.println("----------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� girin ");
		double x = scan.nextDouble();
		System.out.println("bir y say�s� girin ");
		double y = scan.nextDouble();
		System.out.println("yapmak istedi�iniz i�lemi se�in ");
		int �slem = scan.nextInt();
		switch(�slem) {
		case 1: 
			System.out.println("toplama " + toplama(x, y)); break;
		case 2:
			System.out.println("��karma " + ��karma(x, y)); break;
		case 3:
			System.out.println("�arpma " + �arpma(x, y)); break;
		case 4: 
			System.out.println("b�lme " + b�lme(x, y)); break;
			default:
				System.out.println("yanl�� girdi "); break;
		
		}

	}

}
