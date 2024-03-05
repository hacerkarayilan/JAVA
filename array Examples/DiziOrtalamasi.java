package array;

public class ex14 {

	public static void main(String[] args) {
int arr [] = new int [] {3, 5, 6, 7, 8, 9, 10};
System.out.println("ortalama = " + ortalama(arr));
	}
public static double ortalama(int arr[]) {
	double toplam = 0 ;
	for(int i = 0; i<arr.length; i++) {
		toplam += arr[i];
	}
	return toplam / arr.length;
	
}
}
