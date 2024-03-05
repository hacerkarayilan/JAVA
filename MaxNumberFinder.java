package chapter5;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 int number, max;
		 number = input.nextInt(); max = number;
		 while (number != 0) {
		 number = input.nextInt();
		 if (number > max)
		 max = number;
		 }
		 System.out.println("max is " + max);
		 System.out.println("number " + number);
	
	}

}
