package chapter5;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("10 ile 99 aras�nda bir say� girin ");
		int tahmin = 0;
		if(num <= 99 && num >= 10) {
			while( num != tahmin ){
				tahmin = input.nextInt();
				if ( tahmin < num) {
					System.out.println("yukar�ya ��k�n ");
				}
				else if ( tahmin > num) {
					System.out.println("a�ag�ya inin ");
				}
				else if (tahmin == num) {
					System.out.println("dogru tahmin ");
					
				}
				
			}
		}
		else {
			System.out.println("yanl�� aral�kta say� girdiniz ");
		}
	}

}
