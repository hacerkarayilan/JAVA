package array;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
System.out.println("kac tane say�n�n ortalamas�n� bulmak istiyorsun ");
              int say� = scan.nextInt();
              int say�1 [] = new int [say�]; 
double ortalama = 0;
System.out.println("say� giriniz" );
for(int i = 0; i<say�; i++) {
	
	say�1[i] = scan.nextInt();
	ortalama += say�1[i];
	
}
ortalama = ortalama/say�;
System.out.println("girdigin say�lar�n ort:" + ortalama);
	}

}
