package eexercise;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("l�tfen bir harf girin ");
char harf = scan.next().charAt(0);
if (harf == 's' || harf =='S') 
{	
System.out.println("karenin kenar�n� girin ");
double kenar = scan.nextDouble();
System.out.println("karenin alan� " + Math.pow(kenar, 2));
}
else if (harf == 'r' || harf == 'R') {
System.out.println("dikd�rtgenin uzun kenar�n� girin ");
double kenar1 = scan.nextDouble();
System.out.println("dikd�rtgenin k�sa kenar�n� girin ");
double kenar2 = scan.nextDouble();
if ( kenar2 > kenar1) {
	System.out.println("kenar uzunluklar�n� yanl�� girdiniz ");
}else  {
	System.out.println("dikd�rtgenin alan� " + kenar1*kenar2);
	
}

	}


}
}
