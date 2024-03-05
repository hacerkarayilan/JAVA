package YAZTATÝL;

import java.util.Scanner;

public class ex7 {
public static void main(String[] args) {
	Scanner scan  =new Scanner(System.in); 
	System.out.println("bir sayý girin ");
	int sayý = scan.nextInt();
	for(int i = 1; i<=sayý; i++) {
		for(int j = 1; j<i; j++) 
			System.out.print(" ");
		
		for(int j=i;j<=sayý;j++) 
			System.out.print("*" + " ");
		
			
		
		System.out.println(" ");
	}
	for(int i = sayý-1; i>=1; i--) {
		for(int j = 1; j<i; j++)
			System.out.print(" ");
		for(int j=i; j<=sayý; j++ )
			System.out.print("*" + " ");
		System.out.println("");

}
	
}
}
