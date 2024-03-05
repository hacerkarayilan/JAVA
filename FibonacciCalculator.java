package chapter18;

import java.util.Scanner;

public class ex4 {
 
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter an index for a Fibonacci number: ");
		  int n = input.nextInt();
		  int accumlator = 0;
	System.out.println("The Fibonacci number at n " + n + " is " + fibonacci(n, accumlator));
		
		 }
		
	 
		 static int fibonacci(int n, int accumlator) {
			    if (n == 1)
			        return 0;
			    else if (n == 2)
			        return 1;
			    else
			        accumlator = (fibonacci(n - 1, accumlator) + fibonacci(n - 2, accumlator));
			    int accumlator1 =+ accumlator;
			        return accumlator1;
			}
		
		 }
		 
	


