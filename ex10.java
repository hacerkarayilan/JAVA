package chapter6;

import java.util.Scanner;

public class ex10 {
	public  static void pascalUcgeni(int satirNo){
	    if (satirNo==1)
	        System.out.print(" 1 ");
	    else{
	        for(int i = 0; i<=satirNo;i++){
	            System.out.print(kombinasyonHesapla(satirNo,i)+" ");
	        }
	    }

	    }
	    public static int kombinasyonHesapla(int n,int r){
	       return faktoriyelHesapla(n)/(faktoriyelHesapla(r)*faktoriyelHesapla(n-r));
	    }

	    public static int faktoriyelHesapla(int sayi){
	        int fact = 1;
	        for(int i=2;i<=sayi;i++){
	            fact*=i;
	        }
	        return fact;
	    }

	    public static void main(String arg[]){
	        int satirNo = 5;
	        for (int i = 1;i<=satirNo;i++) {
	            pascalUcgeni(i);
	            System.out.println(" ");
	        }
	    }

		
		 
	}


