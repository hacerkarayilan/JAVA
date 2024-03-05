package array;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex18 {


		public static void main(String[] args) {
			 Scanner sn = new Scanner(System.in);
		try {
			File myObj = new File("C:\\Users\\HACER KARAYILAN\\OneDrive\\Masaüstü\\input.txt");
			 Scanner myReaderofwords = new Scanner(myObj);
	            String wordsdata = myReaderofwords.nextLine();
	            String[] word=wordsdata.split("[:,]");
	            int changes=3;

	            int totalScore = 0;  
	            System.out.println("Shuffled word is " + word[0]);

	            while(changes!=0) {
	            	int score = 0;
	            	System.out.println("guess the word ");
	            	String guess = sn.nextLine();
	            	guess=guess.toUpperCase();
	            	changes--;
	            	for (int j = 0; j < word.length; j++) {
	            		if(guess.equals(word[j])) {
	            			for (int i = 0; i < guess.length(); i++) {

	            				if (guess.charAt(i) == 'A' )
	            					score +=1;
	            				else if (guess.charAt(i) == 'B' )
	            					score +=2;
	            				else if (guess.charAt(i) == 'C' )
	            					score +=3;
	            				else if (guess.charAt(i) == 'Ç' )
	            					score +=4;
	            				else if (guess.charAt(i) == 'D' )
	            					score +=5;
	            				else if (guess.charAt(i) == 'E' )
	            					score +=6;
	            				else if (guess.charAt(i) == 'F' )
	            					score +=7;
	            				else if (guess.charAt(i) == 'G' )
	            					score +=8;
	            				else if (guess.charAt(i) == 'Ð' )
	            					score +=9;
	            				else if (guess.charAt(i) == 'H' )
	            					score +=10;
	            				else if (guess.charAt(i) == 'I' )
	            					score +=11;
	            				else if (guess.charAt(i) == 'Ý' )
	            					score +=12;
	            				else if (guess.charAt(i) == 'J' )
	            					score +=13;
	            				else if (guess.charAt(i) == 'K' )
	            					score +=14;
	            				else if (guess.charAt(i) == 'L' )
	            					score +=15;
	            				else if (guess.charAt(i) == 'M' )
	            					score +=16;
	            				else if (guess.charAt(i) == 'N' )
	            					score +=17;
	            				else if (guess.charAt(i) == 'O' )
	            					score +=18;
	            				else if (guess.charAt(i) == 'Ö' )
	            					score +=19;
	            				else if (guess.charAt(i) == 'P' )
	            					score +=20;
	            				else if (guess.charAt(i) == 'R' )
	            					score +=21;
	            				else if (guess.charAt(i) == 'S' )
	            					score +=22;
	            				else if (guess.charAt(i) == 'Þ')
	            					score +=23;
	            				else if (guess.charAt(i) == 'T' )
	            					score +=24;
	            				else if (guess.charAt(i) == 'U' )
	            					score +=25;
	            				else if (guess.charAt(i) == 'Ü' )
	            					score +=26;
	            				else if (guess.charAt(i) == 'V' )
	            					score +=27;
	            				else if (guess.charAt(i) == 'Y' )
	            					score +=28;
	            				else if (guess.charAt(i) == 'Z' )
	            					score +=29;
	            			}
	            			System.arraycopy(word, 0, word, 0, j);
	            			System.arraycopy(word, j + 1, word, j, word.length - j - 1);
	            		}	
	            	}
	            	totalScore += score * guess.length();	            	
	              }  
	            System.out.println("Total score is : " + totalScore);
	            myReaderofwords.close();
	       }
	       catch (FileNotFoundException e) {
	    	   System.out.println("An error occurred.");
	    	   e.printStackTrace();
	       }	       
	   }
}