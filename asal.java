package YAZTATÝL;

import java.util.Scanner;

public class asal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("gir");
		int n = scan.nextInt();
		
		for(int i = 2; i<=n; i++) {
			int x=0;
			for(int j = 2; j<i; j++) {
				if(i%j==0) {
				x++;	
				}
				
			}
			if(x==0) {
				System.out.println(i);
			}
		}
		}
	}

