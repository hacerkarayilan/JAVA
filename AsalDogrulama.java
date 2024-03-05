package YAZTATÝL;

import java.util.Scanner;

public class ex6 {
public static void main(String[] args) {
	/*Scanner scan = new Scanner(System.in);
	System.out.println("bir sayý girin");
	int sayý = scan.nextInt();
	boolean isprime = false ;
	for(int i=2; i<sayý; i++) {
		if(sayý%i==0) {
			isprime=true;
		}
	}
	if(isprime == true)
		System.out.println("asal degil");
else
	System.out.println("asal");*/
	int sayý;
	for(int i = 2; i<100; i++) {
		sayý=0;
		for(int j = 2; j<i/2; j++) {
			if(i%j==0)
				sayý++;
				
		}
		 if(sayý==0) System.out.println(+i);
	}
}

}
