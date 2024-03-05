 package chapter18;

import java.util.Scanner;
public class ex7 {
      public static void Mirror (int n) {
		
		String reverse = "  " ;
		
	if ( n < 0) {
		if( n != -1 ) {
			 
			System.out.print( n + "  ");
		reverse += n;
	   
		n = n / 2;
	Mirror ( n );    
	System.out.print(reverse); }
	else {
			System.out.print("-1"); }
	}

	else {
		if ( n != 1) {
			System.out.print( n + "  " );
		reverse += n;
		n = n / 2;
	Mirror ( n );  
	System.out.print(reverse);}
		
		else {
			System.out.print("1");
			 }
		
	}
	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number");
        int n = scan.nextInt();
        
        Mirror ( n );
        
	}

}
