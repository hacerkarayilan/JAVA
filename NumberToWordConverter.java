package eexercise;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("enter number");
		int num= input.nextInt();
		int digit1=num/100;
		int digit2=(num%100)/10;
		int digit3=(num%100)%10;
		if (num>=100 && num <=999) {
			
			switch (digit1) {
			case 1 :System.out.print("y�z ");
			break;
			case 2 :System.out.print("iki y�z ");
			break;
			case 3 :System.out.print("�� y�z ");
			break;
			case 4 :System.out.print("d�rt y�z ");
			break;
			case 5 :System.out.print("be� y�z ");
			break;
			case 6 :System.out.print("alt� y�z ");
			break;
			case 7 :System.out.print("yedi y�z ");
			break;
			case 8 :System.out.print("sekiz y�z ");
			break;
			case 9 :System.out.print("dokuz y�z ");
			break;
			
			}
			if (digit2 ==1) {
				System.out.print("on ");
			}else if (digit2 ==2) {
				System.out.print("yirmi ");
			}else if (digit2 ==3) {
				System.out.print("otuz ");
			}else if (digit2 ==4) {
				System.out.print("k�rk ");
			}else if (digit2 ==5) {
				System.out.print("elli ");
			}else if (digit2 ==6) {
				System.out.print("altm�� ");
			}else if (digit2 ==7) {
				System.out.print("yetmi� ");
			}else if (digit2 ==8) {
				System.out.print("seksen ");
			}else if (digit2 ==9) {
				System.out.print("doksan ");
				
			}
			switch (digit3) {
			case 1 :System.out.print("bir ");
			break;
			case 2 :System.out.print("iki ");
			break;
			case 3 :System.out.print("�� ");
			break;
			case 4 :System.out.print("d�rt ");
			break;
			case 5 :System.out.print("be� ");
			break;
			case 6 :System.out.print("alt� ");
			break;
			case 7 :System.out.print("yedi ");
			break;
			case 8 :System.out.print("sekiz ");
			break;
			case 9 :System.out.print("dokuz ");
			break;
			}
			
		} else {
			System.out.println("only enter three digit numbers ");
		   }
			}
		}
