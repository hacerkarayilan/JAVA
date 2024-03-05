package chapter18;

import java.util.Scanner;

public class ex6 {
	public static int fib1 (int a, int b, int n) {
    if (n == 1) return a;
    if (n == 2) return b;
    return fib1(b, a+b+1, n-1);
}

public static int fib (int n) {
    return fib1(0, 1, (n > 0) ? n : 1);
}
public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	  System.out.print("Enter an index for a Fibonacci number: ");
	  int n = input.nextInt();
	  
System.out.println("The Fibonacci number at n " + n + " is " + fib(n));
	
	 }
}
