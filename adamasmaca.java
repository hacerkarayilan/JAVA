package ödev;

import java.util.Scanner;

public class adamasmaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int changes=5;
		
			System.out.println("bir kelime girin ");
			
		String secretWord=input.next();
		int count=0;
		
		while (changes!=0) { System.out.println("bir harf girin ");
		
		 
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
		    	  System.out.println("kazandýnýz " );
		    	  System.exit(0);
		      }
		     changes--;
		     if (changes==0) {  System.out.println("hakkýn bitti ve kaybettiniz :(( "); }
	            }  
            		
            		
	
	
	}

	}


