//Kevin Wang - JB1 Assignment 2
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int answer;
		String guess;
		boolean correct = false;
		int numTries = 5; //5 total attempts
		
		//generate random number from 1-100
		answer = rand.nextInt(100) + 1;
		
		System.out.println("Guess a number 1-100 " + answer);
		
		//while still have 5 attempts or not correctly guessed yet
		while(numTries > 0 && !correct) {
			//get input from user
			guess = input.nextLine();
			
			//for input validation
			try {
				
				int x = Integer.parseInt(guess);
				
				//if the number entered is not within the 1-100 range
				if(x < 1 || x > 100) {
					System.out.println("Number out of bounds, enter again");
				}
				
				//if the number guessed is within +10/-10 range of the answer
				else if(x >= answer-10 && x <= answer+10) {
					correct = true;
				}
				
				//Otherwise give them another attempt at guessing and take away 1 try
				else {
					System.out.println("Guess a number 1-100 " + answer);
					numTries--;
				}
				//if the input is NOT an integer
			} catch(NumberFormatException e) {
				
				System.out.println("Input is not an integer");
				
			}
			
		}
		
		//if the guess was correctly within the +10/-10 range
		if(correct) {
			System.out.println("The correct answer was " + answer);
		}
		
		//the number was not guessed in the end
		else {
			System.out.println("Sorry, the answer was " + answer);
		}
		
	}
	
}
