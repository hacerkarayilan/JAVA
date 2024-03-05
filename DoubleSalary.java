package chapter5;

public class ex12 {

	public static void main(String[] args) {
		int year = 0;
		double ücret = 10000;
		while(ücret <= 20000) {
			ücret = ücret * 1.07;
			year++;
			
		}
		System.out.println(year + " yýl sonra ücret iki katý olacak.");
		System.out.printf( "%d yýl sonra ücret %.2f tl olacak " , year , ücret );
		
		 
	}

}
