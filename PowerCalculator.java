package chapter18;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter base value(x):");
		int x=scanner.nextInt();
		
		System.out.println("Enter exponent value(n):");
		int n=scanner.nextInt();
		
		System.out.println(x + " uzeri " + n + " = " + rec(x, n));
		
		
		

	}

	private static int rec(int x, int n) {
		
		if(n==0)  return 1;
		else if(n==1) return x;
		else return x * rec(x, n-1);
	}


	}


