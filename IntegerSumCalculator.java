package chapter5;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir tamsayý girin ");
int tamsayý = scan.nextInt();
int toplam = 0;
while (tamsayý != 0 ) {
	toplam += tamsayý;
	System.out.println("bir tam sayý girin ");
	tamsayý = scan.nextInt(); 
}
System.out.println("toplam " + toplam);
	}

}
