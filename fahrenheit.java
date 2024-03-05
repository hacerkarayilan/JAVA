package tekrar;

import java.util.Scanner;

public class proje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("fahrenheit degerini girin");
double fahrenheit = scan.nextDouble();
double celcius = (5.0/9)*(fahrenheit-32);
System.out.println(fahrenheit + " fahreheit " + celcius + " celcius dur");
	}

}
