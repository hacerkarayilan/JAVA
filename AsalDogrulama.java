package YAZTAT�L;

import java.util.Scanner;

public class ex6 {
public static void main(String[] args) {
	/*Scanner scan = new Scanner(System.in);
	System.out.println("bir say� girin");
	int say� = scan.nextInt();
	boolean isprime = false ;
	for(int i=2; i<say�; i++) {
		if(say�%i==0) {
			isprime=true;
		}
	}
	if(isprime == true)
		System.out.println("asal degil");
else
	System.out.println("asal");*/
	int say�;
	for(int i = 2; i<100; i++) {
		say�=0;
		for(int j = 2; j<i/2; j++) {
			if(i%j==0)
				say�++;
				
		}
		 if(say�==0) System.out.println(+i);
	}
}

}
