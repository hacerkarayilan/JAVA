package eexercise;

import java.util.Scanner;

public class eexecise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		if(input.hasNextInt()||input.hasNextFloat()||input.hasNextDouble()||input.hasNextLong())
		{
			System.out.println(" Unvalid.");
		}
		else
		{
			name = input.nextLine();
			System.out.println("Name is "+ name);
		}
		input.close();
		}
	}


