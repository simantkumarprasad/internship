package internshipProject;
import java.util.Scanner;


	
	 
	public class NumberGame {
	 
	    public static void guessNumber()
	    {
	        Scanner sc = new Scanner(System.in);
	        int number = 1 + (int)(100* Math.random());
	 
	        int K = 10;
	 
	        int i, guess;
	 
	        System.out.println( "Choose a number" + " between 1 to 100 "+ " within 5 trials.");
	 
	        for (i = 0; i < K; i++)
	        {
	 
	            System.out.println("Guess the number:");
	            guess = sc.nextInt();
	            if (number == guess) 
	            {
	                System.out.println("Congratulations!"+ " You guessed the number.");
	                break;
	            }
	            else if (number > guess&& i != K - 1) 
	            {
	                System.out.println("The number is "+ "greater than " + guess);
	            }
	            else if (number < guess && i != K - 1) 
	            {
	                System.out.println("The number is"+ " less than " + guess);
	            }
	        }
	 
	        if (i == K) 
	        {
	            System.out.println("So sorry! you failed to guess the number.");
	 
	            System.out.println("The number was --- " + number);
	        }
	    }
	    public static void main(String arg[])
	    {
	    	guessNumber();
	    }
	}

