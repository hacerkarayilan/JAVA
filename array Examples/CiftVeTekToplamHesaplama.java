package array;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int �ifttop=0; int tektop = 0;
System.out.println("olu�acak dizi kac elemanl� olsun ");
int eleman = scan.nextInt();
int arr [] = new int [eleman];
for(int i =0; i<arr.length; i++) {
	System.out.println("bir say� girin ");
	arr[i] = scan.nextInt();
	if(i % 2 == 0) {
		�ifttop += arr [i];
		
	}
	else {
		tektop += arr [i];
	}
	
}

System.out.println("�ift top " + �ifttop);
	System.out.println("tek toplam " + tektop);
	}

}
