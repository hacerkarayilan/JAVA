package KKD;

public class array {
public static void main(String[]args) {

/*	int arr[]= {1,3,4,8,6,1,4,2};
	int x = sum(3,6,arr);
	System.out.println(x);
}
public static int sum(int a, int b,int arr[]) {
	int s=0;
	for(int i=a; i<=b; i++) {
		s+=arr[i];
	}
	return s;*/
	int arr[]= {1,3,4,8,6,1,4,2};
	int arr1[]=new int[8];
	arr1[0]=1;
	for(int i = 1; i<=arr.length-1; i++) {
		arr1[i]=arr[i]+arr1[i-1];
	}
	for(int i = 0; i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
	System.out.println(arr1[6]-arr1[2]);
}
}




	

		
