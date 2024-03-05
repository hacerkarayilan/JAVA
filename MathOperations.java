package vize2;

import java.util.Scanner;

public class ornek {

	
		 public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);

		        System.out.println("Please enter two numbers: ");
		        int a = in.nextInt();
		        int b = in.nextInt();
		        
		        System.out.println(a + " + " + b + " = " + addTwo(a, b));
		        System.out.println(a + "^" + b + " = " + power(a, b));
		        System.out.println("cos(" + a + ") = " + cosine(a));

		        System.out.println("Enter the third number: ");
		        int c = in.nextInt();
		    
		        System.out.println(a + " + " + b + " + " + c + " = " + addThree(a, b, c));
		        
		        
		        if(a<0) {
		            System.out.println("Enter a positive value for a: ");
		            a = in.nextInt();
		        }
		        
		        System.out.println(a + "! = " + factorial(a));
		        
		        System.out.println("e^" + a + " = " + exponent(a));
		        
		    }
		    
		    public static int addTwo(int a, int b) {
		        int sum = a + b;
		        return sum;
		    }
		    
		    public static int addThree(int a, int b, int c) {
		        int sum = addTwo(a,b) + c;
		        return sum;
		    }
		    
		    public static double power(int a, int b) {
		        double result = 1;
		        for (int i=0; i<b ; i++) {
		            result *= a;
		        }
		        return result;
		    }
		    
		    public static double factorial(int a) {
		        if(a == 0)
		            return 1;
		        double result = 1;
		        for(int i = 1; i<=a; i++) {
		            result *= i;
		        }
		    
		        return result;
		    }
		    

		    public static double exponent(int x) {
		        double result = 0;
		        for(int i=0; i<20 /*deðiþebilir, temsili olarak 20 */ ; i++) {
		            result += power(x, i) / factorial(i);
		            // Alternatif olarak Math.pow(x, i) kullanýlabilir.
		        }
		        
		        return result;
		    }
		    
		    public static double cosine(int x) {
		        //Formüldeki k'yý 20 kabul ettim (normalde sonsuz).
		        int k = 20;
		        double sum = 0;
		        double firstElement;
		        double secondElement;
		                
		        for(int i = 0; i<20 ; i++) {
		            firstElement = power(-1, k);
		            // Alternatif olarak Math.pow(-1, k) kullanýlabilir.
		            secondElement = power(x, (2*k)) / factorial(2*k);
		        
		            sum += firstElement * secondElement ;
		        }
		        
		        return sum;
		    }
		}
	


