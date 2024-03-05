package YAZTATÝL;

import java.util.Scanner;

public class ex10 {
public static void main(String[]args) {
	/*Scanner input = new Scanner(System.in);
	int number, max;
	System.out.println("sayý");
	number = input.nextInt();
	max = number;
	 while (number != 0) {
	 number = input.nextInt();
	 if (number > max)
	 max = number;
	 }
	 System.out.println("max is " + max);
	 System.out.println("number " + number);*/
	double[] myList = new double[10];
	for (int i = 0;i< myList.length -1; i++) {
		// Generate an index j randomly
		int j=(int)(Math.random() * myList.length);
		double temp = myList[i];
		myList[i] = myList[j];
		myList[j] = temp;
		}
		for(int n=0;n<myList.length;n++) {
			System.out.println(myList[n]);
		// Swap myList[i] with myList[j]
		
		}
}
}
