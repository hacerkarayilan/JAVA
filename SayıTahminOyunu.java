package chapter5;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayý = (int)(Math.random() * 101);
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ile 100 arasýnda bir sayý girin ");
		
		int tahmin = 0;
		while (tahmin != sayý) {
			tahmin = scan.nextInt();
			
		if (tahmin < sayý) {
			System.out.println(" yukarý çýkýn ");
		}
		else if ( tahmin == sayý ) {
			System.out.println("doðru tahmin ");
		}
		else if (tahmin > sayý) {
			System.out.println("aþaðý inin ");
		}
		
	}

}
}
