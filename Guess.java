package tekrar;

import java.util.Scanner;

public class proje6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 int random = (int)(Math.random() * 100);
		 
		int guess=0;
		System.out.println("Guess the number");
		while(guess!=random) {
			
			guess= scanner.nextInt();
			
			if(guess==random) 
				System.out.println("true");
			else if(guess<random) 
			System.out.println("Go up");
			else
			System.out.println("Go down");
			
		}
	
	}

}
