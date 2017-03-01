/**
   * file: ComputeChange.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 2, 4.26 
   * due date: February 23, 2017

   * 
   * This file contains the program to compute change
   * 
   */
import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//Receive the amount
		System.out.print(
				"Enter an amount in double, for example 11.56: ");
		String amount = input.next();
		
		int index = amount.indexOf(".");
		
		String dAmount = amount.substring(0, index);
		int dollarAmount = Integer.parseInt(dAmount);
		
		String cAmount = amount.substring(index+1, index+3);
		int coinAmount = Integer.parseInt(cAmount);
		
		
		
		//Find the number of one dollars
		int numberOfOneDollars = dollarAmount;
		int remainingAmount = coinAmount;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		
		//Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		//Display results
		System.out.println("Your Amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");
		
	

	}

}
