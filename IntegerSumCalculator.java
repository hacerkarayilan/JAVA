package chapter5;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir tamsay� girin ");
int tamsay� = scan.nextInt();
int toplam = 0;
while (tamsay� != 0 ) {
	toplam += tamsay�;
	System.out.println("bir tam say� girin ");
	tamsay� = scan.nextInt(); 
}
System.out.println("toplam " + toplam);
	}

}
