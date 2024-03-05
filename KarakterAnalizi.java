package YAZTATÝL;

import java.util.Scanner;

public class ex9 {
public static void main(String [] args){
	/*char ch = 'b';
	System.out.println(++ch);
	char ch1 = (char)65.25;// Decimal 65 is assigned to ch
	System.out.println(ch1);
	--------------------------------*/
	 
	
	/*int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
	System.out.println("i is " + i); // i is 101
	int j = 2 + 'a'; // (int)'a' is 97
	System.out.println("j is " + j); // j is 99
	System.out.println(j + " is the Unicode for character " + (char)j); // 99 is the Unicode for character c
	System.out.println("Chapter " + '2');
	---------------------------------*/
	/*Scanner scan = new Scanner(System.in);
	System.out.println("bir karakter gir");
	char ch=scan.next().charAt(0);
	
	if (ch >= 'A' && ch <= 'Z')
		 System.out.println(ch + " is an uppercase letter");
		else if (ch >= 'a' && ch <= 'z')
		 System.out.println(ch + " is a lowercase letter");
		else if (ch >= '0' && ch <= '9')
		 System.out.println(ch + " is a numeric character");
		 -------------------------------------------------*/
	/*System.out.println("isDigit('a') is " + Character.isDigit('a'));
	System.out.println("isLetter('a') is " + Character.isLetter('a'));
	System.out.println("isLowerCase('a') is "
	 + Character.isLowerCase('a'));
	System.out.println("isUpperCase('a') is "
	 + Character.isUpperCase('a'));
	System.out.println("toLowerCase('T') is "
	 + Character.toLowerCase('T'));
	System.out.println("toUpperCase('q') is "
	 + Character.toUpperCase('q'));
	 --------------------------------------*/
	/*String s1 = "Welcome to Java";
	String s2 = "Welcome to Java";
	String s3 = "Welcome to C++";
	System.out.println(s1.equals(s2)); // true
	System.out.println(s1.equals(s3));
	-------------------------- */
	
	/*Scanner scan = new Scanner(System.in);
	System.out.println("bir karakter gir");
	char c = scan.next().charAt(0);
	if(Character.isDigit(c)) {
	System.out.println("sayý");
	}
	
	else if(Character.isLetter(c)) {
		System.out.println("harf");
	}
	else {
		System.out.println(":(")};
		---------------------------------*/
	Scanner scan = new Scanner(System.in);
	System.out.println("bir karakter gir");
	String s = scan.nextLine();
	//message.substring(0, 11)
	System.out.println(s.substring(1, 5));
	
	
	
}
}
