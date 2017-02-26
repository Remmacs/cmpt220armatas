/**
   * file: lotteryNumberswitches.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 2, 3.15
   * due date: February 2, 2017

   * 
   * This file contains the program to test a lottery w/ switches
   * 
   */
import java.util.Random;
import java.util.Scanner;

public class lotteryNumberswitches {

	public static void main(String[] args) {
		// Generate a lottery number
		Random random = new Random();
		int lottery = random.nextInt(900) + 100;
		
		//prompt user for a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		int matchNum = 0;
		boolean inOrder = true;
		
		//get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery % 10;
		
		//get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess % 10;
		
		
		System.out.println("The lottery number is " + lottery);
		
		//check the guess
		if (guessDigit1 == lotteryDigit1){
			matchNum ++;
		}
		else if(guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3){
			matchNum ++;
			inOrder = false;
			
		}
		else{
			inOrder = false;
		}
		
		if (guessDigit2 == lotteryDigit2){
			matchNum ++;
			
		}
		else if(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3){
			matchNum++;
			inOrder = false;
		}
		else{
			inOrder = false;
		}
		if (guessDigit3 == lotteryDigit3){
			matchNum ++;
		}
		else if(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2){
			matchNum++;
			inOrder = false;
			
		}
		else{
			inOrder = false;
		}
		
		switch(matchNum){
		case 3: if (inOrder){
			System.out.println("You won 10,000 dollars");break;
		}
		else{
			System.out.println("You won 3,000 dollars");break;
		}
		case 2: System.out.println("You won 1,000 dollars");break;
		
		case 1: System.out.println("You won 1,000 dollars");break;
		
		default: System.out.println("Sorry, maybe next time 0 XD");break;
		}
		}
}


