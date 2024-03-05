package tekrar;

import java.util.Scanner;

public class proje3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Scanner input = new Scanner(System.in);
		System.out.println("enter an integer: ");
		int number = input.nextInt();
		
		if (number % 5 == 0)
		System.out.println("HiFive");

		if (number % 2 == 0)
		System.out.println("HiEven");


	}

}
