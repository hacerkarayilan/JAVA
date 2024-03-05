package tekrar;

import java.util.Scanner;

public class proje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("yarýçapý girin");
double yarýçap = scan.nextDouble();
if ( yarýçap >0) {
	double alan = yarýçap * yarýçap * Math.PI;
	System.out.println("alan = " +alan);
}
else {
	System.out.println("yanlýþ girdiniz");
	
}
	}

}
