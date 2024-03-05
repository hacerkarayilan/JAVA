package vize2;

import java.util.Scanner;

public class ex5 {
public static double toplama(double x, double y) {
	return x+y;
}
public static double çýkarma(double x, double y) {
	return x-y;

}
public static double çarpma(double x, double y) {
	return x*y;
}
public static double bölme(double x, double y) {
	return x/y;
	
}
	public static void main(String[] args) {
		System.out.println("----------------");
		System.out.println("toplama 1");
		System.out.println("çýkarma 2");
		System.out.println("çarpma 3");
		System.out.println("bölme 4");
		System.out.println("----------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý girin ");
		double x = scan.nextDouble();
		System.out.println("bir y sayýsý girin ");
		double y = scan.nextDouble();
		System.out.println("yapmak istediðiniz iþlemi seçin ");
		int ýslem = scan.nextInt();
		switch(ýslem) {
		case 1: 
			System.out.println("toplama " + toplama(x, y)); break;
		case 2:
			System.out.println("çýkarma " + çýkarma(x, y)); break;
		case 3:
			System.out.println("çarpma " + çarpma(x, y)); break;
		case 4: 
			System.out.println("bölme " + bölme(x, y)); break;
			default:
				System.out.println("yanlýþ girdi "); break;
		
		}

	}

}
