package eexercise;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int piyango = (int) (Math.random () * 100);
Scanner scan = new Scanner(System.in);
System.out.println("iki basamaklý sayý tahmin edin ");
int tahmin = scan.nextInt();
int onlar = piyango / 10;
int birler = piyango % 10;
int tahminonlar = tahmin / 10;
int tahminbirler = tahmin % 10;
System.out.println("piyango sayýsý " + piyango);
if ( tahmin == piyango ) {
	System.out.println(" 10000 tl kazandýnýz ");
	
}
else if (onlar == tahminbirler && birler == tahminonlar) {
	System.out.println("3000 tl kazandýnýz ");
}
else if (onlar == tahminbirler || onlar == tahminonlar || birler == tahminonlar || birler == tahminbirler) {
	System.out.println("1000 tl kazandýnýz ");
}
else
	System.out.println("kazanamadýnýz :( ");
	}

}
