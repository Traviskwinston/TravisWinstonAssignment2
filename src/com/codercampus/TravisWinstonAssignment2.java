package com.codercampus;
import java.util.*;

//random number guessing game
public class TravisWinstonAssignment2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int numberToGuess = random.nextInt(100) + 1;
		int yourGuess;
		int guesses = 5;
		
		//System.out.println(numberToGuess);
		System.out.println("You have 5 chances to guess my number");
		System.out.print("Pick a number between 1 and 100: ");
		yourGuess = scan.nextInt();
		
		while(guesses > 1 || yourGuess == numberToGuess) {
			if (yourGuess < 1 || yourGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				System.out.println("You still have " + guesses + " guesses left");
				System.out.print("Pick a number between 1 and 100: ");
				yourGuess = scan.nextInt();
			} else if (yourGuess == numberToGuess) {
				System.out.println("You Win!");
				System.exit(0);
			} else if (yourGuess > numberToGuess) {
				System.out.println("My Number is Lower");
				guesses--;
				System.out.println("You have " + guesses + " guesses left");
				System.out.print("guess again: ");
				yourGuess = scan.nextInt();
			} else if (yourGuess < numberToGuess) {
				System.out.println("My Number is Higher");
				guesses--;
				System.out.println("You have " + guesses + " guesses left");
				System.out.print("guess again: ");
				yourGuess = scan.nextInt();
			}
		}
		System.out.println("you lose");
		System.out.println("The number to guess was: " + numberToGuess);
		scan.close();
	}
}
