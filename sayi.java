package eexercise;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayý girin ");
int sayý = scan.nextInt();
int iþlem = sayý + (sayý*10 + sayý) + (sayý*100 + sayý*10 + sayý);
System.out.println("iþlem " + iþlem);

	}

}
