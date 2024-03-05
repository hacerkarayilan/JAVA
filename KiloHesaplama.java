package eexercise;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("kilonuzu girin ");
double kilo = scan.nextDouble();
System.out.println("boyunuzu girin ");
double boy = scan.nextDouble();
double BMI = (kilo) / (boy * boy) ;
if ( BMI < 18.5) {
	System.out.println("underweight ");
	}
else if ( 18.5 <= BMI && BMI<= 25.0) {
	System.out.println("normal ");
	}
else if ( 25.0 <= BMI && BMI <= 30.0) {
	System.out.println("overweight ");
}
else
	System.out.println("obese ");
	}

}
