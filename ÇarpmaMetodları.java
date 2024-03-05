package chapter6;

public class ex5 {
public static void çarpma(int a, int b) {
	System.out.println("çarpma " + (a*b));
}
public static void çarpma(int a, int b, int c) {
	System.out.println("çarpma " + (a*b*c));
}
public static void çarpma(int a, int b, int c, int d) {
	System.out.println("çarpma " + (a*b*c*d));
}
	public static void main(String[] args) {
		
		çarpma (2,3);
		çarpma (2,3,4);
		çarpma (2,3,4,5);
		
	}

}
