package chapter5;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("3 ile 6 aras�nda bir para de�eri girin ");
		double parabirirmi = scan.nextInt();
double para1 = 3;
double para2 = 6;
double m��teri1 = 10;
double m��teri2 = 1000;
double e�im = (m��teri2 - m��teri1) / (para2 - para1);
double sonu� = e�im * (para1 - parabirirmi) + m��teri2;
System.out.println("sonu� " + sonu�);
	}

}
