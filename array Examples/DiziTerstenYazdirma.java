package array;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("dizi ka� elemanl� olsun " );
	int eleman = scan.nextInt();
	int arr [] = new int [eleman];
	for(int i =0; i< arr.length; i++) {
		System.out.println("bir deger girin ");
		 arr [i] = scan.nextInt();
		 
	}
	
	System.out.println("olu�an yeni dizi ");
    for (int j = arr.length - 1;  j >= 0; j--) {
    	
    	System.out.print(arr[j] + " ");
    }
  
	
	}

}
