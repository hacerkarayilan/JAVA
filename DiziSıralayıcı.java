package YAZTATÝL;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] a = new int[10];

/*for(int i = 0; i<a.length; i++) {
System.out.println("deger gir");
a[i] = scan.nextInt();
}
--------------------------------*/
/*for(int i=0;i<a.length;i++) {
	a[i]=(int)Math.pow(i, 2);
}
for(int i = 0; i<a.length; i++) {
	a[i] = a[i]*a[i];
	System.out.println(a[i]);
}
--------------------------------*/
/*int []myList=new int[10];
int max = myList[0];
int indexOfMax = 0;
for (int i = 1; i < myList.length; i++) {
 if (myList[i] > max) {
 max = myList[i];
 indexOfMax = i;
 System.out.println(myList[i]);
 }
}
----------------------------------*/
/*int[] b= {1,2,3,4,10};
int max = b[0];
int imax=0;
for (int i = 1; i < b.length; i++) {
if(b[i]>max) {
	max=b[i];
}
	
	}
System.out.println(max);
-------------------------------*/
/*int []myList= {1,2,3,4,5};

for (int i = 0;i< myList.length - 1; i++) {
	
	int j=(int)(Math.random()
	* myList.length);
	// Swap myList[i] with myList[j]
	int temp = myList[i];
	myList[i] = myList[j];
	myList[j] =  temp;
	System.out.println(myList[i]);
}
----------------------------*/
/*int [] c= new int [5];
for(int i = 0; i<5; i++) {
	c[i]=(int)(Math.random()*10);
	System.out.println(c[i]);
}
System.out.println("-------------------------");
for(int i = 0; i<5; i++) {

int j=(int)(Math.random()* c.length);
int temp = c[i];
c[i] =c[j];
c[j] =  temp;
	System.out.println(c[i]);
	
	
	
}--------------------------------*/
/*int [] c= new int [5];
int temp = c[0]; 
for(int i = 0; i<5; i++) {
	c[i]=i;
	System.out.println(c[i]);
}
for (int i = 1; i < c.length; i++) {
	c[i - 1] =c[i];
	//System.out.println(c[i]);
	}
c[c.length - 1] = temp;
for(int i=0;i<c.length;i++ ) {
	System.out.println(c[i]);
	
}
-------------------------*/
/*System.out.println("bir sayý gir");
int n=scan.nextInt();
System.out.println("sayýlar");
int sum=0;

int [] sayý =new int [n];
for(int i = 0; i<n; i++) {
	sayý[i]=scan.nextInt();
	sum+=sayý[i];

}
double ort=sum/n;
int count = 0;
System.out.println("ortalama"+ort);
for(int i = 0; i<sayý.length; i++) {
	if(sayý[i]>ort) {
		count++;
	}
}
System.out.println(count);
---------------------------------*/
int [] c = {5,8,4,9,2,6,7,1};

for(int i = 0; i<c.length; i++) {
	for(int x=i+1;x<c.length;x++){
		if(c[i]<c[x]){
			
		}
		else if(c[i]>c[x]) {
			int temp=c[x];
			c[x]=c[i];
			c[i]=temp;
		}
	}
}
for(int i =0;i<c.length;i++)
System.out.print(c[i]);
}
}