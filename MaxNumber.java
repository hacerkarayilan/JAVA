package eexercise;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("ilk say�y� girin ");
int s1 = scan.nextInt();
System.out.println("ikinci say�y� girin ");
int s2 = scan.nextInt();
System.out.println("���nc� say�y� girin ");
int s3 = scan.nextInt();
if ( s1 > s2 && s1 > s3) {
	System.out.println("s1 en b�y�k say� ");
}
else if ( s2 > s3 && s2 > s3) {
	System.out.println(" s2 en b�y�k say� ");
	}
else if ( s3 > s1 && s3 > s2) {
	System.out.println("s3 en b�y�k say� ");
}
	}

}
