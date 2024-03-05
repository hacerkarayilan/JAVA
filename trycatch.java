package week3;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the name of file");
			String name = scan.next();
			File myfile = new File(name+".txt");
			if(myfile.createNewFile()) {
				System.out.println("yeni bir dosya olu�turuldu " );
			}
			else {
				System.out.println(name + " dosyas� mevcut ");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
