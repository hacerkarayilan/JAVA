package ödev;

import java.util.Scanner;

public class pascalucgený {

	public static void print(int n) {
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(pascal(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int pascal(int i, int j) {
		if (j == 0) {
			return 1;
			
		} else if (j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a row number ");
		int row = scan.nextInt();
		print(row);

	}

}