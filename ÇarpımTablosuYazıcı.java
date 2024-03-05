package chapter5;

public class ex9 {

	
		 public static void main(String[] args) {
		System.out.println("çarpým tablosu ");
		System.out.print("    ");
		for(int a = 1; a <= 9; a++) 
	    	
	    System.out.print("   " + a);
	    	System.out.println("\n-------------------"); 
	    	for(int b = 1; b <= 9; b++) {
	    		System.out.print(b + " | ");
	    		for(int a = 1; a<=9; a++) {
	    			System.out.printf("%4d" , a*b);
	    		}
	    		System.out.println();
	    	}
	    	
			
		}
		
	
		}
	



