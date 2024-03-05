package week3;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("please enter the money you want to withdraw:");
int money = scan.nextInt();
int b200=money/200;
money-=b200*200;
int b100=money/100;
money-=b100*100;
int b50=money/50;
money-=b50*50;
int b20=money/20;
money-=b20*20;
int b10=money/10;
money-=b10*10;
System.out.println("number of 200 liras:"+b200);
System.out.println("number of 100 liras:"+b100);
System.out.println("number of 50 liras:"+b50);
System.out.println("number of 20 liras:"+b20);
System.out.println("number of 10 liras:"+b10);
System.out.println("the money which cannot be withdraw:"+money);

	}

}
