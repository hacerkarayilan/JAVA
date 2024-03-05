package eexercise;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("çekmek isrediðin parayý gir ");
int para = scan.nextInt();
int ikiyüzlük = para / 200;
int para2 = para - ikiyüzlük*200;
int yüzlük = para2 / 100;
int para3 = para2 - yüzlük*100;
int ellilik = para3 / 50;
int para4 = para3 - ellilik*50;
int yirmilik = para4 / 20;
int para5 = para4 - yirmilik*20;
int onluk = para5 / 10;
int kalanpara = para5 - onluk*10;
System.out.println("iki yüzlük barkod " + ikiyüzlük);
System.out.println("yüzlük barkod " + yüzlük);
System.out.println("ellilik barkod " + ellilik);
System.out.println("yirmilik barkod " + yirmilik);
System.out.println("onluk barkod " + onluk);
System.out.println("kalan para " + kalanpara);




	}

}
