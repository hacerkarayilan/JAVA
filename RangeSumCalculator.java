package chapter6;

public class ex7 {
	public static int sum(int i1, int i2) {
		int toplam = 0;
		for(int i = i1; i <= i2; i++) 
			
			toplam += i;
		
		    return toplam;
	}
	

	public static void main(String[] args) {
		 System.out.println("1 den 10 a kadar olan sayýlarýn toplamý " + sum(1 , 10) );
		 System.out.println("10 dan 20 ye kadar olan sayýlarýn toplamý " + sum(10 , 20));
		 System.out.println("20 den 30 a kadar olan sayýlartýn toplamý " + sum(20 , 30));
	}

}
