package eexercise;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number1 = (int) (Math.random()  * 10);
int number2 = (int) (Math.random() * 10);
if (number2 > number1) {
	int temp = number1;
	number1 = number2;
	number2 = temp;
			
} 
Scanner scan = new Scanner(System.in);
System.out.println("what is the " + number1 + "-" + number2);
int answer = scan.nextInt();
if ( number1 - number2 == answer) {
	System.out.println("dogru girdiniz ");
}
else
	System.out.println("yanlış girdiniz ");
	}

}
