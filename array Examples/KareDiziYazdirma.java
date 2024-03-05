package array;

public class ex1 {

	public static void main(String[] args) {
int sayýlar [] = new int[10];
for(int i = 0; i < sayýlar.length; i++) {
sayýlar[i] = (int)(Math.pow(i, 2));

}
for(int i = 0; i < sayýlar.length; i++) {
	System.out.println("eleman " + sayýlar[i]);
}
	}

}
