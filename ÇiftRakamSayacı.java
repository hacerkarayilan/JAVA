package chapter18;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("bir say� girin ");
int say� = scan.nextInt();
System.out.println("�ift rakam say�s� " + �ift(say�));
	}
	public static int �ift(int say�) {
		int �iftrakam = 0;
			
			if ( say� != 0) {
		    int sonrakam = say� % 10;
		    int kalanrakam = say� / 10;
		    
		    if (sonrakam % 2 == 0) {
		    	�iftrakam++;
		    	
		    	  return 1 + �ift(kalanrakam);
		   } 
		    else {
		    	
		    	return 0 + �ift(kalanrakam);
		    	
		    }   }
			return �iftrakam;
			
		}
	
	}


