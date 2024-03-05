package fýnal;
import java.util.*;

	public class GFG {

		
		/*public static void main(String[] args)
		{

			List<Integer> l1 = new ArrayList<Integer>();
            l1.add(0, 1);
			l1.add(1, 2);

			System.out.println(l1);
            List<Integer> l2 = new ArrayList<Integer>();

			l2.add(1);
			l2.add(2);
			l2.add(3);

			l1.addAll(1, l2);

			System.out.println(l1);

			l1.remove(1);

			System.out.println(l1);

			System.out.println(l1.get(3));

			l1.set(0, 5);

			System.out.println(l1);
		}*/
		
		
		/*	public static void main(String args[])
			{
				// Creating an empty Arraylist of string type
				List<String> al = new ArrayList<>();

				// Adding elements to above object of ArrayList
				al.add("Geeks");
				al.add("Geeks");

				// Adding element at specified position
				// inside list object
				al.add(1, "For");

				// Using for loop for iteration
				for (int i = 0; i < al.size(); i++) {

					// Using get() method to
					// access particular element
					System.out.print(al.get(i) + " ");
				}

				// New line for better readability
				System.out.println();

				// Using for-each loop for iteration
				for (String str : al)

					// Printing all the elements
					// which was inside object
					System.out.print(str + " ");
			}*/
		
		// Java program to demonstrate the
		// creation of list object using the
		// ArrayList class

		
			public static void main(String[] args)
			{
				// Size of ArrayList
				int n = 5;

				// Declaring the List with initial size n
				List<Integer> arrli = new ArrayList<Integer>();
			
				// Appending the new elements
				// at the end of the list
				for (int i = 1; i <= n; i++)
					arrli.add(i);

				// Printing elements
				System.out.println(arrli);

				// Remove element at index 3
				arrli.remove(3);

				// Displaying the list after deletion
				System.out.println(arrli);

				// Printing elements one by one
				for (int i = 0; i < arrli.size(); i++)
					System.out.print(arrli.get(i) + " ");
			}
		}

		

		
		
		
		
		
		
	

