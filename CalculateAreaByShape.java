package eexercise;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("lütfen bir harf girin ");
char harf = scan.next().charAt(0);
if (harf == 's' || harf =='S') 
{	
System.out.println("karenin kenarýný girin ");
double kenar = scan.nextDouble();
System.out.println("karenin alaný " + Math.pow(kenar, 2));
}
else if (harf == 'r' || harf == 'R') {
System.out.println("dikdörtgenin uzun kenarýný girin ");
double kenar1 = scan.nextDouble();
System.out.println("dikdörtgenin kýsa kenarýný girin ");
double kenar2 = scan.nextDouble();
if ( kenar2 > kenar1) {
	System.out.println("kenar uzunluklarýný yanlýþ girdiniz ");
}else  {
	System.out.println("dikdörtgenin alaný " + kenar1*kenar2);
	
}

	}


}
}
