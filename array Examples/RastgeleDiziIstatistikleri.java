package array;

public class ex10 {

	public static void main(String[] args) {
		int enkucuk = 900;
		int enbuyuk = 0;
		int toplam = 0;
		int arr [][] = new int [3][2];
		for(int i=0 ; i < 3; i++) {
			for (int j = 0; j<2; j++) {
				int rastgelesayý = (int)(Math.random()*100);
				arr [i][j] = rastgelesayý;
				toplam = toplam + rastgelesayý;
				System.out.println(i + ". satýrda " + j + ". sutundeki eleman " + " = " + arr[i][j]);
				if(enkucuk > rastgelesayý) {
					enkucuk=rastgelesayý;
					
				}
			  if(enbuyuk<rastgelesayý) {
					enbuyuk=rastgelesayý;
				}
			}
		}
		System.out.println("en buyuk sayý = " + enbuyuk );
		System.out.println("en kucuk sayý = " + enkucuk);
		System.out.println("toplam " + toplam);
	}

}
