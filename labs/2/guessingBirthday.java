/**
   * file: guessingBirthday.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 2, 4.10
   * due date: February 2, 2017

   * 
   * This file guesses your birthday using string sets
   */
import java.util.Scanner;

public class guessingBirthday {
	public static void main(String[] args){
		String set1 = 
				" 1 3 5 7\n" +
				" 9 11 13 15\n" +
				"17 19 21 23\n" +
				"25 27 29 31\n";
		
		String set2 =
				" 2 3 6 7\n" +
				"10 11 14 15\n" +
				"18 19 22 23\n" +
				"26 27 30 31\n";
		
		String set3 =
				" 4 5 6 7\n" +
				"12 13 14 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31";
		
		String set4 =
				" 8 9 10 11\n" +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		
		String set5 =
				"16 17 18 19\n" +
				"20 21 22 23\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		
		int day = 0;
		
		//create scanner 
		Scanner input = new Scanner(System.in);
		
		//set values for Y and N
		
	
		
		//prompt the user to answer questions
		System.out.print("Is your birthday in set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter N for No and Y for Yes: ");
		String answer = input.next();
		
		
		if (answer.toUpperCase().equals("Y"))
			day += 1;
		
		// Prompt the user to answer questions
		System.out.print("\nIs your birthday in set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter N for No and Y for Yes: ");
		answer = input.next();
		
		
		if (answer.toUpperCase().equals("Y"))
			day += 2;
		//Prompt the user to answer questions
		System.out.print("\nIs your birthday in set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter N for No and Y for Yes: ");
		answer = input.next();
		
		if (answer.toUpperCase().equals("Y"))
			day += 4;
		//prompt the user to answer questions
		
		System.out.print("\nIs your birthday in set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter N for No and Y for Yes: ");
		answer = input.next();
		
		if (answer.toUpperCase().equals("Y"))
			day += 8;
		
		//prompt the user to answer questions
		System.out.print("\nIs your birthday in set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter N for No and Y for Yes: ");
		answer = input.next();
		
		if (answer.toUpperCase().equals("Y"))
			day += 16;
		
		System.out.println("\nYour birthday is " + day + "!");
		
	}

}
