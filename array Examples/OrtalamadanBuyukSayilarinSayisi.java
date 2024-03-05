package array;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("bir n sayýsý girin ");
		int n = scan.nextInt();
		int numbers [] = new int [n];
		int sum = 0;
		System.out.println("sayý gir: ");
		for(int i = 0; i<n; i++) {
			
		numbers [i] = scan.nextInt();
		sum = sum + numbers[i];
		}
		double average = sum / n;
		int count = 0;
		for(int i = 0; i< n ; i ++) 
			if(numbers[i] > average) 
				count++;
			
			
		
		System.out.println("ortalama " + average);
		System.out.println("en büyük " + count);

	}
}
