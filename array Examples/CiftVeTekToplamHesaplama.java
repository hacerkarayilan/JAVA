package array;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int çifttop=0; int tektop = 0;
System.out.println("oluþacak dizi kac elemanlý olsun ");
int eleman = scan.nextInt();
int arr [] = new int [eleman];
for(int i =0; i<arr.length; i++) {
	System.out.println("bir sayý girin ");
	arr[i] = scan.nextInt();
	if(i % 2 == 0) {
		çifttop += arr [i];
		
	}
	else {
		tektop += arr [i];
	}
	
}

System.out.println("çift top " + çifttop);
	System.out.println("tek toplam " + tektop);
	}

}
