package chapter5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int say� = (int)(Math.random() * 101);
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ile 100 aras�nda bir say� girin ");
		
		int tahmin = 0;
		while (tahmin != say�) {
			tahmin = scan.nextInt();
			
		if (tahmin < say�) {
			System.out.println(" yukar� ��k�n ");
		}
		else if ( tahmin == say� ) {
			System.out.println("do�ru tahmin ");
		}
		else if (tahmin > say�) {
			System.out.println("a�a�� inin ");
		}
		
	}

}
}
