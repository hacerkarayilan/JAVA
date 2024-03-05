package fýnal;

public class gfg1 {
	 public static void main (String[] args)
	    {
	        // declares an Array of integers.
		 student[] arr=new student[20];;
	 
	        // allocating memory for 5 objects of type Student.
	        arr = new student[5];
	 
	        // initialize the first elements of the array
	        arr[0] = new student(1,"aman");
	 
	        // initialize the second elements of the array
	        arr[1] = new student(2,"vaibhav");
	 
	        // so on...
	        arr[2] = new student(3,"shikar");
	        arr[3] = new student(4,"dharmesh");
	        arr[4] = new student(5,"mohit");
	 
	        // accessing the elements of the specified array
	        for (int i = 0; i < arr.length; i++)
	            System.out.println("Element at " + i + " : " + arr[i].roll_no +" "+ arr[i].name);
	    }
}
