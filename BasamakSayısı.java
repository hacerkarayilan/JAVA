package eexercise;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("bir sayý girin ");
int sayý = scan.nextInt();
if ( sayý <10 ) {
	System.out.println("sayý tek basamaklý ");
}
else if (sayý < 100) {
	System.out.println("sayý iki basamaklý ");
}
else if (sayý < 1000) {
	System.out.println("sayý üç basamaklý ");
}
else if (sayý < 10000) {
	System.out.println("sayý dört basamaklý ");
}
else if (sayý < 100000) {
	System.out.println("sayý beþ basamaklý ");
}
else {
	System.out.println("yanlýþ aralýkta sayý girdiniz ");
}
	}

}
