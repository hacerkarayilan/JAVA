package array;

public class ex9 {

	public static void main(String[] args) {
int say�lar [] = new int [100];
int count = 0;
int toplam = 0;
for(int i = 0; i < say�lar.length; i++) {
	int rastgelesay� = (int) (Math.random() * 100); 
	say�lar[i] = rastgelesay�;
   toplam = toplam + rastgelesay�;
  
}
double ortalama =(double) toplam / say�lar.length;
System.out.println("ortalama " + ortalama);
for( int i = 0; i< say�lar.length; i++) {
	if(ortalama > say�lar[i]) {
		count++;
	}
}
System.out.println("count " + count);


	}

}
