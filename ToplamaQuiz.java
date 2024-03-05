package chapter5;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = (int)(Math.random() * 10); 
int num2 = (int)(Math.random() * 10);
Scanner scan = new Scanner(System.in);
System.out.println( num1 +  " + " + num2 + " = " + "?");
int answer = scan.nextInt();
while(num1 + num2 != answer) {
	System.out.println("tekrar deneyin " + num1 + " + " + num2 + " = " + "?");
	answer = scan.nextInt();
}
System.out.println("dogru cevap ");
	}

}
