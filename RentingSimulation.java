package chapter5;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int kiralamaücreti = 50; kiralamaücreti >= 50 && kiralamaücreti <= 200; kiralamaücreti++ ) {
					
int kira1 = 50;
int kira2 = 200; 
int araba1 = 750;
int araba2 = 0;
int eðim = (araba2 - araba1) / (kira2 - kira1);
int kiralananaraba = eðim * (kiralamaücreti - kira1) + araba1;
int kiralananaraba1 = eðim * ((kiralamaücreti + 1) - kira1) + araba1;
int ücret1 = kiralananaraba * kiralamaücreti;
int ücret2 = kiralananaraba1 * (kiralamaücreti + 1);
if ( ücret1 > ücret2) {	
System.out.println("kiralama ücreti " + kiralamaücreti + " olduðu zaman " + kiralananaraba + " araba kiralanýyor.");
System.out.println( + ücret1 + " ücret kazanýyor " );
System.exit(1);
}
}
	}

}
