package chapter5;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int kiralama�creti = 50; kiralama�creti >= 50 && kiralama�creti <= 200; kiralama�creti++ ) {
					
int kira1 = 50;
int kira2 = 200; 
int araba1 = 750;
int araba2 = 0;
int e�im = (araba2 - araba1) / (kira2 - kira1);
int kiralananaraba = e�im * (kiralama�creti - kira1) + araba1;
int kiralananaraba1 = e�im * ((kiralama�creti + 1) - kira1) + araba1;
int �cret1 = kiralananaraba * kiralama�creti;
int �cret2 = kiralananaraba1 * (kiralama�creti + 1);
if ( �cret1 > �cret2) {	
System.out.println("kiralama �creti " + kiralama�creti + " oldu�u zaman " + kiralananaraba + " araba kiralan�yor.");
System.out.println( + �cret1 + " �cret kazan�yor " );
System.exit(1);
}
}
	}

}
