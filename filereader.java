package week3;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class filereader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			File hacer = new File("C:\\Users\\HACER KARAYILAN\\OneDrive\\Masaüstü\\programlama lab\\input.txt");
			Scanner scan = new Scanner (hacer);
			String dosya = scan.next();
			System.out.println(dosya);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		
		

	}

}
