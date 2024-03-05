package eexercise;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("bir isim girin "); 

if ( input.hasNextInt()) {
	System.out.println("yanlýþ girdiniz ");
}
else if ( input.hasNextDouble()) {
	System.out.println("yanlýþ girdiniz ");
}
else if ( input.hasNextFloat()) {
	System.out.println("yanlýþ girdiniz ");
}
else if ( input.hasNextLine()) {
	String isim = input.nextLine();
	System.out.println(isim);
	
	
	
}
	}

}
