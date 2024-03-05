package array;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
System.out.println("kac tane sayýnýn ortalamasýný bulmak istiyorsun ");
              int sayý = scan.nextInt();
              int sayý1 [] = new int [sayý]; 
double ortalama = 0;
System.out.println("sayý giriniz" );
for(int i = 0; i<sayý; i++) {
	
	sayý1[i] = scan.nextInt();
	ortalama += sayý1[i];
	
}
ortalama = ortalama/sayý;
System.out.println("girdigin sayýlarýn ort:" + ortalama);
	}

}
