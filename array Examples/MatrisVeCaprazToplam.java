package array;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
int arr [][] = new int [5][5];
int carpraztop = 0;
for(int i = 0; i<5; i++) {
	for(int j =0; j<5; j++) {
		 arr[i][j] = (int)(Math.random()*10);
		 System.out.print(arr[i][j] + "  ");
		
	}
	System.out.println();
	carpraztop = carpraztop + arr[i][i];
}
System.out.println("çarpraz toplam = " + carpraztop);
 	}

}
