package YAZTAT�L;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("bir say� girin ");
		int say�=scan.nextInt();
	/*int bolen = 2;
	int bolunen=say�;
	while(bolen<say�)
	{
		if(bolunen%bolen==0) {
			System.out.println(bolen);
		bolunen/=bolen;}
		else{
			bolen++;
			}
	}
		*/
		/*while(say�%2==0)
		{
			System.out.print(2+" ");
			say�/=2;
		}*/
		for(int i=2;i<=say�;i++)
		{
			while(say�%i==0)
			{
				System.out.print(i+" ");
				say�/=i;
			}
		}
		/*if(say�>2)
			System.out.print(say�);*/
	      

		}
			
		}
		
		
		
		
		
		
		


