package YAZTATÝL;

import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = ((int)(Math.random()*100));
int count = 0;
	for(int a1=1; a1<a; a1++) {
	if(a1%2!=0)
		count++;
	
	if(a1%2!=0)
	System.out.println(a1);
	}
	System.out.println("rastgele sayý " + a);
	System.out.println("kac tek" + count); 
	
	/*int min=10;
	int max=100;
	
	int endNumber = min+(int)( Math.random()*(max-min+1));
	
	System.out.printf("Random generated number: %d \n",endNumber);
	
	System.out.printf("ALL ODD NUMBERS UP TO %d\n",endNumber);
	
	for(int i=0;i<=endNumber;i++)
	{
		if(i%2==1)
		{
			System.out.print(i+" ");
		}
	}*/

}
}

