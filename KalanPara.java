package eexercise;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("�ekmek isredi�in paray� gir ");
int para = scan.nextInt();
int ikiy�zl�k = para / 200;
int para2 = para - ikiy�zl�k*200;
int y�zl�k = para2 / 100;
int para3 = para2 - y�zl�k*100;
int ellilik = para3 / 50;
int para4 = para3 - ellilik*50;
int yirmilik = para4 / 20;
int para5 = para4 - yirmilik*20;
int onluk = para5 / 10;
int kalanpara = para5 - onluk*10;
System.out.println("iki y�zl�k barkod " + ikiy�zl�k);
System.out.println("y�zl�k barkod " + y�zl�k);
System.out.println("ellilik barkod " + ellilik);
System.out.println("yirmilik barkod " + yirmilik);
System.out.println("onluk barkod " + onluk);
System.out.println("kalan para " + kalanpara);




	}

}
