package vize2;


import java.util.Scanner;

public class ex4 {
	
    public static double say�(double x, double y, double z) {
    	
    	
    	
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
		System.out.println("bir x say�s� girin ");
		double x = scan.nextDouble();
		System.out.println("bir y say�s� girin ");
		double y = scan.nextDouble();
		System.out.println("bir z say�s� girin ");
		double z = scan.nextDouble();
		System.out.println("en b�y�k say�: " + say�(x, y, z));
	}

}
