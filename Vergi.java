package eexercise;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("miktarý girin");
double miktar = scan.nextDouble();
double vergi = miktar*0.05;
System.out.println("vergi miktar" + ((int)(vergi*100)/100.0 + miktar));
	}

}
