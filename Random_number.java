import java.util.Scanner;
import java.util.Random;
public class Random_number
{
public static void main(String[] args)
	{
	    int answer, guess;	   // stores actual and guess number
	    final int MAX = 100;   // maximum value is 100
		Scanner in = new Scanner(System.in);   // takes input using scanner
		Random rand = new Random();   // Random instance
		boolean correct = false;
		answer = rand.nextInt(MAX) + 1; // correct answer
		while (!correct) {
		System.out.println("Guess a number between 1 and 100: ");
		guess = in.nextInt();
			if (guess > answer) 
			{
				System.out.println("Too high, try again");
			}
			else if (guess < answer) 
			{
				System.out.println("Too low, try again");
			}
			else
			{
				System.out.println("Yes, you guessed the number.");
				correct = true;
			}
		}
		System.exit(0);
	}
}
