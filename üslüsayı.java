package week2;

import java.util.Scanner;

public class üslüsayı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number");
		int number = input.nextInt();
		System.out.println(number + "^2: " + Math.pow(number,  2));
		System.out.println(number + "^3: " + Math.pow(number,  3));
		System.out.println(number + "^4: " + Math.pow(number,  4));
	}

}
