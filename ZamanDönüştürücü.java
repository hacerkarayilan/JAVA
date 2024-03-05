package tekrar;

import java.util.Scanner;

public class proje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayı giriniz");
int saniye = scan.nextInt();
int dakika = saniye / 60;
int saniye1 = saniye % 60;
int saat = dakika / 60;
int dakika1 = dakika % 60;
System.out.println(saat + ":" + dakika1 + ":" + saniye1);

	}

}
