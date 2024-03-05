package YAZTATÝL;

import java.util.Scanner;

public class top {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("bir ilaç dozu gir");
int birincigün=scan.nextInt();
int ikincigün= birincigün+birincigün*10/100;
System.out.println("ikinci gün " + ikincigün);
int ucuncugün= ikincigün+ikincigün*10/100;
System.out.println("üçüncü gün " + ikincigün);
int dgün= ucuncugün+ucuncugün*10/100;
System.out.println("ucuncu gün " + ucuncugün);
int bgün= dgün+dgün*10/100;
System.out.println("dört gün " + dgün);

int agün= bgün+bgün*10/100;
System.out.println("altý gün " + agün);
int ygün= agün+agün*10/100;
System.out.println("yedi gün " + ygün);
	}

}
