package YAZTATÝL;

public class ex13 {

public static void main(String[] args) {
/*	int list []= {1,3,4,8,6,1,4,2};
int x = sum(3,6,list);	
System.out.println(x);
}
public static int sum(int a,int b, int list[]) {
	int s = 0;
	for(int i=a; i<=b; i++) {
		
		s+=list[i];	
	}
	return s;
}
-----------------------------------------------*/
/*int list []= {1,3,4,8,6,1,4,2};
int nlist[]=new int [8];
nlist[0]=1;

for(int i = 1; i<=list.length-1; i++) {
	nlist[i]=list[i]+nlist[i-1];

}
for(int i = 0; i<nlist.length; i++) {
	System.out.println(nlist[i]);
}
System.out.println(nlist[6] - nlist[2]); 
------------------------------------*/
	/* SELEC SORT       int temp = 0;
	int dizi[]=new int [5];
	for(int i = 0; i<dizi.length; i++) {
		dizi[i]=(int)(Math.random()*10);
		
	}
	for(int i =0; i<dizi.length; i++) {
		System.out.println(dizi[i]);
	}
	System.out.println("---------------------------");
	for(int i = 0; i<dizi.length; i++) {
	  int min = i;
	  for(int j=i+1; j<dizi.length; j++) {
		  if(dizi[min]>dizi[j]) {
			  temp=dizi[min];
			  dizi[min]=dizi[j];
			  dizi[j]=temp;
		  }  
	  }
	  
		}
	for(int j =0; j<dizi.length; j++) {
		System.out.println(dizi[j]);
	}*/
	
	/*int dizi[]=new int [5];
	for(int i = 0; i<dizi.length; i++) {
		dizi[i]=(int)(Math.random()*10);
		
	}
	for(int i =0; i<dizi.length; i++) {
		System.out.println(dizi[i]);
	}
	System.out.println("---------------------------");
	 
	
	for(int i = 0; )*/
	
	int temp=0;
	int dizi []= new int[5];
	for(int i = 0; i<dizi.length; i++) {
		dizi[i]=(int)(Math.random()*10);
		
	}
	for(int i=0; i<dizi.length; i++) {
		System.out.printf("%3d",dizi[i]);
	}
	for(int i = 0; i<dizi.length-1;i++) {
		for(int j = 0; j<dizi.length-1-i;j++) {
			if(dizi[j+1]<dizi[j]) {
				temp=dizi[j+1];
				dizi[j+1]=dizi[j];
				dizi[j ]=temp;
			}
		}
	}
	System.out.println();
	for(int j=0; j<dizi.length; j++) {
		System.out.printf("%3d",dizi[j]);
	}
}
}

