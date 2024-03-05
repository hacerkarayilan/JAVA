package vize2;


import java.util.Scanner;

public class ex4 {
	
    public static double sayý(double x, double y, double z) {
    	
    	
    	
    	if (x > y && x > z) {
    		return x;
    	}
    	else if(y > x && y > z) {
    	     return y;
    	}
    	else if (z > x && z > y){
             return z;
    	}
		return x;
    	
   
	
  
    }
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir x sayýsý girin ");
		double x = scan.nextDouble();
		System.out.println("bir y sayýsý girin ");
		double y = scan.nextDouble();
		System.out.println("bir z sayýsý girin ");
		double z = scan.nextDouble();
		System.out.println("en büyük sayý: " + sayý(x, y, z));
	}

}
