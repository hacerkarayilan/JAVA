package array;

public class ex10 {

	public static void main(String[] args) {
		int enkucuk = 900;
		int enbuyuk = 0;
		int toplam = 0;
		int arr [][] = new int [3][2];
		for(int i=0 ; i < 3; i++) {
			for (int j = 0; j<2; j++) {
				int rastgelesay� = (int)(Math.random()*100);
				arr [i][j] = rastgelesay�;
				toplam = toplam + rastgelesay�;
				System.out.println(i + ". sat�rda " + j + ". sutundeki eleman " + " = " + arr[i][j]);
				if(enkucuk > rastgelesay�) {
					enkucuk=rastgelesay�;
					
				}
			  if(enbuyuk<rastgelesay�) {
					enbuyuk=rastgelesay�;
				}
			}
		}
		System.out.println("en buyuk say� = " + enbuyuk );
		System.out.println("en kucuk say� = " + enkucuk);
		System.out.println("toplam " + toplam);
	}

}
