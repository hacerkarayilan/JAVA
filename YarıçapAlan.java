package tekrar;

import java.util.Scanner;

public class proje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("yar��ap� girin");
double yar��ap = scan.nextDouble();
if ( yar��ap >0) {
	double alan = yar��ap * yar��ap * Math.PI;
	System.out.println("alan = " +alan);
}
else {
	System.out.println("yanl�� girdiniz");
	
}
	}

}
