package week3;

import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter annual income:");
		int income=scan.nextInt();
		double tax=income*0.18;
		System.out.println("annual tax:"+tax);
	}

}
