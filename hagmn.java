package ödev;

import java.util.Scanner;

public class hagmn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int changes=5;
		
			System.out.println("please enter a word to start the game: ");
		
		String secretWord=input.next();
		int count=0;
		
		while (changes!=0) { System.out.println(" please enter a letter: ");
		
		 
	  char guessedLetter = input.next().charAt(0);
		
		        for (int i = 0; i < secretWord.length(); i++) {
		        	
		        char currentLetter=secretWord.charAt(i);
		
	if (guessedLetter==currentLetter) {
		System.out.print(guessedLetter);
		
		count++;
	          }
	else  {
	
		System.out.print("_");
	}
	
		   }
		      if (count==secretWord.length()) {
		    	  System.out.println("  You won the game! " );
		    	  System.exit(0);
		      }
		     
	            }  
            		
            		
	if (changes==0) {  System.out.println("You Are Out of Chances! Game over!"); }
	
	}


	}


