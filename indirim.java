package eexercise;

import java.util.Scanner;

public class indirim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("ürün miktarýný girin ");
double miktar = scan.nextDouble();
if (miktar < 0) {
	System.out.println("0 dan büyük sayý girin ");
}
else if (miktar > 0 && miktar < 100) {
	miktar = miktar - miktar * 0.04;
	System.out.println("miktar " + miktar);
}
else if (miktar >= 100 && miktar <250) {
	miktar = miktar - 100 * 0.05 - (miktar - 100)*0.07;
	System.out.println("miktar " + miktar);
}
else if (miktar >= 250) {
	miktar = miktar - 100 * 0.06 - 150 * 0.08 - (miktar - 250) * 0.1;  
	System.out.println("miktar " + miktar);
}
	}

}
