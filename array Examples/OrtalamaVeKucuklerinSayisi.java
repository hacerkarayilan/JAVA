package array;

public class ex9 {

	public static void main(String[] args) {
int sayılar [] = new int [100];
int count = 0;
int toplam = 0;
for(int i = 0; i < sayılar.length; i++) {
	int rastgelesayı = (int) (Math.random() * 100); 
	sayılar[i] = rastgelesayı;
   toplam = toplam + rastgelesayı;
  
}
double ortalama =(double) toplam / sayılar.length;
System.out.println("ortalama " + ortalama);
for( int i = 0; i< sayılar.length; i++) {
	if(ortalama > sayılar[i]) {
		count++;
	}
}
System.out.println("count " + count);


	}

}
