package YAZTATÝL;

import java.util.Scanner;

public class ex3 {
public static void main(String [] args) {
	
	Scanner scan = new Scanner(System.in);
	int min = 0;
	int max = 100;
int rn = ((int)(Math.random()*100));

int sayý = -1;
while(sayý != rn) {
System.out.println("bir sayý tahmin et");
sayý = scan.nextInt();
if(sayý<rn) {
	System.out.println("daha buyuk sayý gir");
}

else if(sayý>rn) {
	System.out.println("daha kucuk sayý gir");
}
}
 if(sayý==rn) {
	System.out.println("kazandýnýz ");
}
	/*int number = (int)(Math.random() * 101);
	
	Scanner input = new Scanner(System.in);
	System.out.println("Guess a magic number between 0 and 100");
	int max_Value=100;
	int minValue=0;
	
	int guess = -1,guess2=-1;
	
	 while (guess != number&& guess2 != number)
	 {
	  // Prompt the user to guess the number
      System.out.print("\nEnter your guess: ");
      guess = input.nextInt();
     
      if (guess == number)
       {
    	   System.out.println("Yes, the number is " + number+" . You Won!!!");
    	   break;
       }
          
       else if (guess > number)
       {
    	   System.out.println("Your guess is too high. Player 2 quessing...");
    	   if(guess<max_Value)
    		   max_Value=guess;
           guess2 = minValue+(int)( Math.random()*(max_Value-minValue));
       }
       else 
       {
    	   System.out.println("Your guess is too low");
    	   if(guess>minValue)
    		   minValue=guess;
    	   guess2 = (minValue+1)+(int)( Math.random()*(max_Value-minValue));
       }
    	   
       
       
      // Prompt the Player 2 to guess the number
	   
       if (guess2 == number)
       {
    	   System.out.println("Yes, the number is " + number+" . Player 2 Won!!!");
    	   break;
       }
          
       else if (guess2 > number)
       
    	   System.out.printf("Player 2's guess %d and it is too high\n",guess2);
       else
    	   System.out.printf("Player 2's guess %d and it is too low\n",guess2);


}*/
}
}
