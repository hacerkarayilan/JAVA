package YAZTATÝL;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
	String string,nw = "";	
Scanner scan = new Scanner(System.in);
System.out.println("kelime gir");
 /*string=scan.nextLine();

int length = string.length();
for(int i = length-1; i>=0; i--) {
	 nw = nw + string.charAt(i);
	
}
if(string.equals(nw))
	System.out.println("palindrome");

else
	System.out.println("not palindrome");*/
String kelime = scan.nextLine();

for(int i = kelime.length(); i>=0; i--) {

	System.out.println(kelime.charAt(i));
}


	}
	
	
}
