package chapter5;

public class ex12 {

	public static void main(String[] args) {
		int year = 0;
		double �cret = 10000;
		while(�cret <= 20000) {
			�cret = �cret * 1.07;
			year++;
			
		}
		System.out.println(year + " y�l sonra �cret iki kat� olacak.");
		System.out.printf( "%d y�l sonra �cret %.2f tl olacak " , year , �cret );
		
		 
	}

}
