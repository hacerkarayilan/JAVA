package array;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("bir ay rakamý girin ");
int ay = scan.nextInt();
String[] aylar = {"ocak", "þubat", "mart", "nisan", "mayýs", "haziran", "temmuz", "aðustos", "eylül", "ekim", "kasým", "aralýk"};
System.out.println("seçtiðiniz ay " + aylar[ay-1]);

	}

}
