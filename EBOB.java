package chapter5;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir a say�s� girin ");
		int a = scan.nextInt();
		System.out.println("bir b say�s� girin ");
		int b = scan.nextInt();
		int ebob = 1;
		int k = 2;
		while(k <= a && k <= b) {
			if(a % k == 0 && b % k == 0) 
			
				ebob = k;
				k++;
			
				
		}
		System.out.println(a + " a " + b + " b nin en b�y�k ortak b�leni " + ebob + " dur ");
	}

}
