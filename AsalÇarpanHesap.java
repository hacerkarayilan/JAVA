package YAZTATÝL;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý girin ");
		int sayý=scan.nextInt();
	/*int bolen = 2;
	int bolunen=sayý;
	while(bolen<sayý)
	{
		if(bolunen%bolen==0) {
			System.out.println(bolen);
		bolunen/=bolen;}
		else{
			bolen++;
			}
	}
		*/
		/*while(sayý%2==0)
		{
			System.out.print(2+" ");
			sayý/=2;
		}*/
		for(int i=2;i<=sayý;i++)
		{
			while(sayý%i==0)
			{
				System.out.print(i+" ");
				sayý/=i;
			}
		}
		/*if(sayý>2)
			System.out.print(sayý);*/
	      

		}
			
		}
		
		
		
		
		
		
		


