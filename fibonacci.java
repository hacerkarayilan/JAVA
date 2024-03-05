package chapter18;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("bir sayý girin ");
int n = scan.nextInt();
System.out.println(n + ". fibonacci = " + fibonacci(n));
	}
public static int fibonacci(int n) {
	if(n == 0)
return 0;
	else if ( n == 1)
		return 1;
	else
	return fibonacci(n-1) + fibonacci(n-2);
}
}
