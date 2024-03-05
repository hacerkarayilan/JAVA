package week2;

import java.util.Scanner;

public class cýkartma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter first number:");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		System.out.print("enter second number:");
		int y=scan.nextInt();
		System.out.println(x+"-"+y+"="+(x-y));
	}

}
