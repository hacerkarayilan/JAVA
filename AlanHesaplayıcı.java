package YAZTATÝL;

import java.util.Scanner;

public class ex1 {
public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
System.out.println("s , S yada r, R girin");
char harf = scan.next().charAt(0);

if(harf == 's' || harf == 'S' ) {
	System.out.println("lütfen kare kenarýný soyle ");
int kenar = scan.nextInt();
System.out.println("kare " + kenar*kenar);

}
else if(harf == 'r' || harf == 'R') {
	System.out.println("uzun kenar ");
	int uzunk = scan.nextInt();
	System.out.println("kýsa kenar ");
int kýsak= scan.nextInt();
System.out.println("dikd " + kýsak*uzunk);
}
System.out.println();
}
}
