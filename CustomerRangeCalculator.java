package chapter5;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("3 ile 6 arasýnda bir para deðeri girin ");
		double parabirirmi = scan.nextInt();
double para1 = 3;
double para2 = 6;
double müþteri1 = 10;
double müþteri2 = 1000;
double eðim = (müþteri2 - müþteri1) / (para2 - para1);
double sonuç = eðim * (para1 - parabirirmi) + müþteri2;
System.out.println("sonuç " + sonuç);
	}

}
