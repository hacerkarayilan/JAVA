package eexercise;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir say� girin ");
int say� = scan.nextInt();
int i�lem = say� + (say�*10 + say�) + (say�*100 + say�*10 + say�);
System.out.println("i�lem " + i�lem);

	}

}
