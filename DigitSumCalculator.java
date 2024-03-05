package chapter5;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayý giriniz ");
int sayý = scan.nextInt();
int toplam = 0;
do {
	toplam += sayý % 10 ;
	sayý = sayý / 10 ;
	System.out.println("toplam= " + toplam + " sayý= " + sayý);
	
}
while (sayý > 0); {
	System.out.println("toplam= " +toplam);
	
	
}
	}

}
