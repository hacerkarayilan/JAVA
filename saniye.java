package week2;

import java.util.Scanner;

public class saniye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("enter the number");
int seconds = input.nextInt();
int p1 = seconds % 60;
int p2 = seconds / 60;
int p3 = p2 %60;
p2 = p2 / 60;
System.out.print(p2 + ":" +p3 + ":" + p1);
	}

}
