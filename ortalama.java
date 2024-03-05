package week3;

import java.util.Scanner;

public class ortalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("please enter midterm 1 score:");
int mid1 = scan.nextInt();
System.out.println("please enter midterm 2 score:");
int mid2 = scan.nextInt();
System.out.println("please enter assignments score:");
int assignments = scan.nextInt();
System.out.println("please enter quiz score:");
int quiz = scan.nextInt();
System.out.println("please enter fýnal score:");
int fýnal = scan.nextInt();
double Totalgrade=mid1*0.15+mid2*0.15+assignments*0.20+quiz*0.10+fýnal*0.40;
System.out.println("average"+ Totalgrade);
	}

}
