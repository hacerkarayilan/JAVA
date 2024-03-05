package chapter5;

import java.util.Scanner;

public class ekok {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("birinci sayýyý girin ");
int a = scan.nextInt();
System.out.println("ikinci sayýyý girin ");
int b = scan.nextInt();
int ekok = 1;
int k = a * b;
while(k <= a*b && k > 0) {
	if(k % a == 0 && k % b == 0)
		ekok = k;
	k--;
}

System.out.println("ekok " + ekok);

	}

}
