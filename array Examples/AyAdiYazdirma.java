package array;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("bir ay rakam� girin ");
int ay = scan.nextInt();
String[] aylar = {"ocak", "�ubat", "mart", "nisan", "may�s", "haziran", "temmuz", "a�ustos", "eyl�l", "ekim", "kas�m", "aral�k"};
System.out.println("se�ti�iniz ay " + aylar[ay-1]);

	}

}
