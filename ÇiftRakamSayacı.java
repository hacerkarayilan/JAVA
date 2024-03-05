package chapter18;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("bir sayı girin ");
int sayı = scan.nextInt();
System.out.println("çift rakam sayısı " + çift(sayı));
	}
	public static int çift(int sayı) {
		int çiftrakam = 0;
			
			if ( sayı != 0) {
		    int sonrakam = sayı % 10;
		    int kalanrakam = sayı / 10;
		    
		    if (sonrakam % 2 == 0) {
		    	çiftrakam++;
		    	
		    	  return 1 + çift(kalanrakam);
		   } 
		    else {
		    	
		    	return 0 + çift(kalanrakam);
		    	
		    }   }
			return çiftrakam;
			
		}
	
	}


