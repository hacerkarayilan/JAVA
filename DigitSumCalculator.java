package chapter5;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir say� giriniz ");
int say� = scan.nextInt();
int toplam = 0;
do {
	toplam += say� % 10 ;
	say� = say� / 10 ;
	System.out.println("toplam= " + toplam + " say�= " + say�);
	
}
while (say� > 0); {
	System.out.println("toplam= " +toplam);
	
	
}
	}

}
