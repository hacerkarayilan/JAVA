package YAZTAT�L;

import java.util.Scanner;

public class top {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("bir ila� dozu gir");
int birincig�n=scan.nextInt();
int ikincig�n= birincig�n+birincig�n*10/100;
System.out.println("ikinci g�n " + ikincig�n);
int ucuncug�n= ikincig�n+ikincig�n*10/100;
System.out.println("���nc� g�n " + ikincig�n);
int dg�n= ucuncug�n+ucuncug�n*10/100;
System.out.println("ucuncu g�n " + ucuncug�n);
int bg�n= dg�n+dg�n*10/100;
System.out.println("d�rt g�n " + dg�n);

int ag�n= bg�n+bg�n*10/100;
System.out.println("alt� g�n " + ag�n);
int yg�n= ag�n+ag�n*10/100;
System.out.println("yedi g�n " + yg�n);
	}

}
